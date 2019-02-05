/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import personajes.Phill;

/**
 *
 * @author nicol
 */
public final class Lienzo extends JPanel{
        
    BufferedImage imagenLienzo;
    HojaSprites phillJobs;
    Phill phillColection;
    
    
    public Lienzo(){
        setVisible(true);
        phillColection = new Phill();        
        imagenLienzo = new BufferedImage(800,800,BufferedImage.TYPE_INT_RGB);        
    }
    
    public BufferedImage actualizarImagen(Sprite SpriteADibujar, BufferedImage imagenLienzo){
        int pixeles[][] = SpriteADibujar.pixeles;
        for(int i=0; i<SpriteADibujar.alto ;i++){
            for(int j=0; j<SpriteADibujar.ancho; j++){
                imagenLienzo.setRGB(j, i, pixeles[i][j]);
            }
        }
        return imagenLienzo;
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(imagenLienzo, phillColection.x, phillColection.y, null);
    }
        public void actionPerformed(ActionEvent e){
        phillColection.actualizar();
        repaint();
    }
}
