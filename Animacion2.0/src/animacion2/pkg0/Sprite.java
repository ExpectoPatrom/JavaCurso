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
public class Sprite{

    public final int ancho;
    public final int alto;
    int[][] pixeles;
    public Sprite(HojaSprites sprite,int alto, int ancho,int posX, int posY){
        this.ancho=ancho;
        this.alto=alto;
        pixeles = new int[alto][ancho];
        
        for(int x=0; x<sprite.ancho;x++){
            for(int y=0; y<sprite.alto;y++){
                if(posX<ancho && posY<alto){
                    pixeles[x][y]=sprite.pixeles[posX*ancho][posY*alto];
                }
            }
        }
    }
    
}