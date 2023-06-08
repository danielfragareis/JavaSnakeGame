/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakegameinjava;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author daniel
 */
public class Snake extends JFrame {
    
 public Snake() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Grade());
        
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}
