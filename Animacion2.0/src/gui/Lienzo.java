/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Controles.Teclado;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author nicol
 */
public final class Lienzo extends JPanel{
        
    BufferedImage imagenLienzo;
    HojaSprites phillJobs;
    private static Teclado teclado;
    boolean jugando;
    //coleccion sprites
    Sprite phill1;
    Sprite Phill2;
    Sprite Phill3;
    Sprite Phill4;
    Sprite Phill5;
    Sprite Phill6;
    Sprite Phill7;
    Sprite Phill8;
    Sprite Phill9;
    Sprite Phill10;
    Sprite Phill11;
    Sprite Phill12;
    Sprite Phill113;
    Sprite Phill14;
    Sprite Phill15;
    Sprite Phill16;
    //fin
    
    
    public Lienzo(){
        jugando = true;
        teclado = new Teclado();
        addKeyListener(teclado);
        setVisible(true);
        imagenLienzo = new BufferedImage(800,800,BufferedImage.TYPE_INT_RGB);
        phillJobs = new HojaSprites("../RECURSOS/SpriteSheet.png");
    }
    public void jugar(boolean jugando){
        while(jugando){
            teclado.actualizar();
            if(teclado.arriba == true){
                System.out.println("arriba");
            }
         }
    }
    public BufferedImage actualizarImagen(Sprite phill1, BufferedImage imagenLienzo){
        int pixeles[][] = phill1.pixeles;
        for(int i=0; i<phill1.alto ;i++){
            for(int j=0; j<phill1.ancho; j++){
                imagenLienzo.setRGB(j, i, pixeles[i][j]);
            }
        }
        return imagenLienzo;
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(imagenLienzo, 0, 0, null);
        System.out.println("assaas");
    }
}
