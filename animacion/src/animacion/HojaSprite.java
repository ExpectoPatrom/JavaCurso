/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacion;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class HojaSprite {
    public String ruta;
    public int[][]pixeles;
    public int alto, ancho;
    BufferedImage imagen;
    
    /**
     *
     * @param ruta
     * @param alto
     * @param ancho
     */
    public HojaSprite(String ruta,int alto,int ancho){
        pixeles = new int[alto][ancho];
        try {
            imagen = ImageIO.read(HojaSprite.class.getResource(ruta));
        } catch (IOException ex) {
            Logger.getLogger(HojaSprite.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int x=0; x<ancho;x++){
            for(int y=0; x<alto; y++){
                pixeles[x][y]=imagen.getRGB(x,y);
            }
        }
    }
}
