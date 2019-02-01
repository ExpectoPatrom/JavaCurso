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
    public Sprite(HojaSprites sprite,int alto, int ancho,int posI, int posJ){
        this.ancho=ancho;
        this.alto=alto;
        pixeles = new int[alto][ancho];
        int barridoI;
        int barridoJ;
        barridoI = posI*alto--;
        barridoJ = posJ*ancho--;
        for(int i=0; i<this.alto;i++){
            for(int j=0; j<this.ancho;j++){
                if(barridoI<sprite.alto && barridoJ<sprite.ancho){
                    pixeles[i][j]=sprite.pixeles[barridoI][barridoJ];
                    System.out.println("barridoI: "+barridoI + " barridoJ: "+barridoJ);
                    //System.out.println(pixeles[i][j]);
                     barridoJ++;
                }
                barridoI++;
            }
        }
    }
    
}