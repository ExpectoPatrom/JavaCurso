/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacion2.pkg0;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/**
 *
 * @author estudiantes
 */
public class Animacion20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dimension dimension = new Dimension(800,800);
        JFrame ventana = new JFrame();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(dimension);
        HojaSprites SpritePj = new HojaSprites("SpriteSheet.png");
        Sprite pos1 = new Sprite(SpritePj,52,36,0,0);
        BufferedImage fondo = null;
        for(int i=0; i<800; i++){
            for(int j=0; j<800; j++){
                fondo.setRGB(i, j, pos1.pixeles[i][j]);
            }
        }        
    }
    
}
