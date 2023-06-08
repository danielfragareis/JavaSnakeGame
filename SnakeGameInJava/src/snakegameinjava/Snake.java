/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakegameinjava;

import javax.swing.JFrame;

/**
 *
 * @author daniel
 */
public class Snake extends JFrame {
    
    public Snake(){
        add(new Grade());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(420, 440);
        
        setLocationRelativeTo(null);
        
        setTitle("Snake Game");
        
        setResizable(false);
        
        setVisible(true);
    }
}
