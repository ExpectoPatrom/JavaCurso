/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

import gui.HojaSprites;
import gui.Sprite;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author nicol
 */
public class Phill implements KeyListener{
    
    int teclaPresionada;
    public int x;
    public int y; 
    int dx,dy;
    HojaSprites phillJobs;
    public Sprite Phill1;
    public Sprite Phill2;
    public Sprite Phill3;
    public Sprite Phill4;
    public Sprite Phill5;
    public Sprite Phill6;
    public Sprite Phill7;
    public Sprite Phill8;
    public Sprite Phill9;
    public Sprite Phill10;
    public Sprite Phill11;
    public Sprite Phill12;
    public Sprite Phill13;
    public Sprite Phill14;
    public Sprite Phill15;
    public Sprite Phill16;
    
    
    public Phill(){
        teclaPresionada = 0;
        x=0;y=0;dx=0;dy=0;
        phillJobs = new HojaSprites("../RECURSOS/SpriteSheet.png");
        Phill1 = new Sprite(phillJobs,52,36,0,0);
        Phill2 = new Sprite(phillJobs,52,36,0,1);
        Phill3 = new Sprite(phillJobs,52,36,0,2);
        Phill4 = new Sprite(phillJobs,52,36,0,3);
        Phill5 = new Sprite(phillJobs,52,36,1,0);
        Phill6 = new Sprite(phillJobs,52,36,1,1);
        Phill7 = new Sprite(phillJobs,52,36,1,2);
        Phill8 = new Sprite(phillJobs,52,36,1,3);
        Phill9 = new Sprite(phillJobs,52,36,2,0);
        Phill10 = new Sprite(phillJobs,52,36,2,1);
        Phill11 = new Sprite(phillJobs,52,36,2,2);
        Phill12 = new Sprite(phillJobs,52,36,2,3);
        Phill13 = new Sprite(phillJobs,52,36,3,0);
        Phill14 = new Sprite(phillJobs,52,36,3,1);
        Phill15 = new Sprite(phillJobs,52,36,3,2);
        Phill16 = new Sprite(phillJobs,52,36,3,3);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        teclaPresionada = e.getKeyCode();
        
        if(teclaPresionada == KeyEvent.VK_W && y>=2){
            dy-=2;
            System.out.println("Up");
        }
        if(teclaPresionada == KeyEvent.VK_S && y<=798){
            dy+=2;
            System.out.println("Down");
        }
        if(teclaPresionada == KeyEvent.VK_A && x>=2){
            dx-=2;
            System.out.println("LEFT");
        }
        if(teclaPresionada == KeyEvent.VK_D && x<=798){
            dx+=2;
            System.out.println("RIGTH");
        }
    }
    public void actualizar(){
        x = x +dx;
        y = y + dy;
    }
    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
