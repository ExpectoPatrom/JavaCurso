/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Estudiantes
 */
public class Teclado implements KeyListener{

    private final int numeroTeclas = 120;
    private final boolean[] teclado = new boolean[numeroTeclas];
    public boolean arriba;
    public boolean abajo;
    public boolean izquierda;
    public boolean derecha;
    
    public void actualizar(){
        arriba = teclado[KeyEvent.VK_W];
        abajo = teclado[KeyEvent.VK_S];
        izquierda = teclado[KeyEvent.VK_A];
        derecha  = teclado[KeyEvent.VK_D];
    }
    @Override
    public void keyTyped(KeyEvent e) {
        teclado[e.getKeyCode()] = true;
    }
   
    @Override
    public void keyPressed(KeyEvent e) {
        teclado[e.getKeyCode()] = false;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
