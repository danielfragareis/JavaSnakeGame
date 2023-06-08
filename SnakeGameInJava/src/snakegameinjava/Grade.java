/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakegameinjava;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author daniel
 */
public class Grade extends JPanel implements ActionListener {
   private final int WIDTH_ = 400;
   private final int HEIGHT_ = 400;
   private final int PIXEL_SIZE = 10;
   private final int ALL_PIXELS = WIDTH_ * HEIGHT_;
   private final int RANDOM_POSITION = 29;
   private final int DELAY = 140;
   
   // definição do plano cartesiano(x,y) do jogo
   private int[] x = new int[ALL_PIXELS];
   private int[] y = new int[ALL_PIXELS];
   
   private int points;
   
   // posição comida
   private int foodX;
   private int foodY;
   
   // contar pontuação
   private int score = 0;
   String scoreMessage = "Score: " + score;
   Font scoreFont = new Font("Consolas", Font.BOLD,12);
   
   // tamanho total do texto na tela
   FontMetrics scoreMetrics = this.getFontMetrics(scoreFont);
   
   // movimentos na tela
   private boolean left = false;
   private boolean right = false;
   private boolean up = false;
   private boolean down = false;

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }

    public boolean isUp() {
        return up;
    }

    public boolean isDown() {
        return down;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setDown(boolean down) {
        this.down = down;
    }
   
   
   // status do jogo
   private boolean itsPlaying = true;
   
   // tempo de execução do jogo
   private Timer time;
   
   // imagens da cabeça e corpo da snake e da comida
   private Image ball;
   private Image food;
   private Image head;
   
   // Constructor
   
   public Grade(){
       // Cria instrução no teclado
       // necessário criar a classe TAdapter
       addKeyListener(new TAdapter());
       
       setBackground(Color.lightGray);
       
       ImageIcon bola_ = new ImageIcon("bola.png");
       ball = bola_.getImage();
       
       ImageIcon food_ = new ImageIcon("apple.png");
       food = food_.getImage();
       
       ImageIcon head_ = new ImageIcon("cabeça.png");
       head = head_.getImage();
       
       setFocusable(true);
       
       setSize(WIDTH_, HEIGHT_);
       
       initGame();
   }

    public void initGame() {
        score = 3;
        
        for(int i = 0; i < score; i++){
            x[i] = 50 - i * 10;
            y[i] = 50;
        }
        
        localFood();
        
        time = new Timer(DELAY,this);
        time.start();
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        if(itsPlaying){
            g.drawImage(food, foodX, foodY, this);
            
            for(int i = 0; i < score; i++){
                if(i == 0){
                    g.drawImage(head, x[i], y[i], this);
                }else{
                    g.drawImage(ball, x[i], y[i], this);
                }
            }
            
            drawScoreOnScreen(g);
            
            Toolkit.getDefaultToolkit().sync();
            
            g.dispose();
        }else{
            GameOver(g);
        }
    }

    private void drawScoreOnScreen(Graphics g) {
        scoreMessage = "Score: " + score;
        scoreMetrics = this.getFontMetrics(scoreFont);
        
        g.setColor(Color.WHITE);
        g.setFont(scoreFont);
    }
}
