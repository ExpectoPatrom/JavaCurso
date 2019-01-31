/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacion2.pkg0;

/**
 *
 * @author estudiantes
 */
import java.awt.image.BufferedImage;

public class HojaSprites {
    public String ruta;
    public int[][]pixeles;
    public int alto, ancho;
    BufferedImage imagen;
    
    
    
    public HojaSprites(String ruta){
        cargaImagen ImagenCargada = new cargaImagen("SpriteSheet.png");
        imagen = ImagenCargada.img;
        alto=imagen.getHeight();
        ancho=imagen.getWidth();
        pixeles = new int[alto][ancho];
        
        for(int x=0; x<alto;x++){
            for(int y=0; y<ancho; y++){
                pixeles[x][y]=imagen.getRGB(x,y);
                //System.out.println(imagen.getHeight()+" ancho:"+imagen.getWidth());
            }
        }
    }
    
    
}