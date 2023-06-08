/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakegameinjava;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author daniel
 */
public class TAdapter extends KeyAdapter {
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();
            Grade keyPressed = (Grade) e.getSource();
            if ((key == KeyEvent.VK_LEFT) && (!keyPressed.rightDirection)) {
                keyPressed.leftDirection = true;
                keyPressed.upDirection = false;
                keyPressed.downDirection = false;
            }

            if ((key == KeyEvent.VK_RIGHT) && (!keyPressed.leftDirection)) {
                keyPressed.rightDirection = true;
                keyPressed.upDirection = false;
                keyPressed.downDirection = false;
            }

            if ((key == KeyEvent.VK_UP) && (!keyPressed.downDirection)) {
                keyPressed.upDirection = true;
                keyPressed.rightDirection = false;
                keyPressed.leftDirection = false;
            }

            if ((key == KeyEvent.VK_DOWN) && (!keyPressed.upDirection)) {
                keyPressed.downDirection = true;
                keyPressed.rightDirection = false;
                keyPressed.leftDirection = false;
            }
        }
    }
