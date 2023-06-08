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
  @Override
   public void keyPressed(KeyEvent e){
       int key = e.getKeyCode();
       Grade keyPressed = new Grade();
       
       if((key == KeyEvent.VK_LEFT) && (!keyPressed.isRight())){
           keyPressed.setLeft(true);
           keyPressed.setUp(true);
           keyPressed.setDown(true);
       }
       
       if((key == KeyEvent.VK_RIGHT) && (!keyPressed.isLeft())){
           keyPressed.setRight(true);
           keyPressed.setUp(true);
           keyPressed.setDown(true);
       }
       
       if((key == KeyEvent.VK_UP) && (!keyPressed.isDown())){
           keyPressed.setLeft(true);
           keyPressed.setUp(true);
           keyPressed.setRight(true);
       }
       
       if((key == KeyEvent.VK_DOWN) && (!keyPressed.isUp())){
           keyPressed.setLeft(true);
           keyPressed.setRight(true);
           keyPressed.setDown(true);
       }
   }
}
