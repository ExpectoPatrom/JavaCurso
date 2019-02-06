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
import javax.swing.Timer;
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
        imagenLienzo = actualizarImagen(phillColection.PhillDelMomento, imagenLienzo,1,1);
    }
    
    
    public BufferedImage actualizarImagen(Sprite SpriteADibujar, BufferedImage imagenLienzo,int x,int y){
        int pixeles[][] = SpriteADibujar.pixeles;
        for(int i=0; i<SpriteADibujar.alto ;i++){
            for(int j=0; j<SpriteADibujar.ancho; j++){
                imagenLienzo.setRGB(j+x, i+y, pixeles[i][j]);
            }
        }
        return imagenLienzo;
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        System.out.println("aaa");
        Graphics2D g2d = (Graphics2D)g;
        imagenLienzo = actualizarImagen(phillColection.PhillDelMomento, imagenLienzo,phillColection.x,phillColection.y);
        g2d.drawImage(imagenLienzo, 0, 0, null);
        g.dispose();
    }
    public void ActionPerformed(ActionEvent e){
        phillColection.actualizar();
        repaint();
    }
    
}
