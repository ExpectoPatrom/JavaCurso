/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static com.sun.glass.ui.Cursor.setVisible;
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
    Sprite phill1;
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(imagenLienzo, 0, 0, null);
        System.out.println("assaas");
        g2d.drawOval(10, 10, 10, 10);
    }
    
    public Lienzo(){
        setVisible(true);
        imagenLienzo = new BufferedImage(800,800,BufferedImage.TYPE_INT_RGB);
        phillJobs = new HojaSprites("../RECURSOS/SpriteSheet.png");
        phill1 = new Sprite(phillJobs,52,36,0,1);
        imagenLienzo = actualizarImagen(phill1, imagenLienzo);
    }
    public BufferedImage actualizarImagen(Sprite phill1, BufferedImage imagenLienzo){
        int pixeles[][] = phill1.pixeles;
        for(int i=0; i<phill1.alto ;i++){
            for(int j=0; j<phill1.ancho; j++){
                imagenLienzo.setRGB(i, j, pixeles[i][j]);
            }
        }
        return imagenLienzo;
    }
    
}
