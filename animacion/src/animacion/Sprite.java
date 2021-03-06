package animacion;

public class Sprite{

    public final int ancho;
    public final int alto;
    int[][] pixeles;
    public Sprite(HojaSprite sprite,int alto, int ancho,int posX, int posY){
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
