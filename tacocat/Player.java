package tacocat;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class Player extends GameObject {
 
   BufferedImage imageParado;
   BufferedImage imageBatendo;
   BufferedImage imageParadoflip;
   BufferedImage imageBatendoflip; 
   Player(int x, int y) throws ObjetoNaoEncontradoException, IOException{
        super(x, y, ID.Player, true);
        File file = new File("");

            this.imageParado = ImageIO.read(new File(file.getAbsoluteFile()+"\\src\\main\\java\\tacocat\\Sprites\\gatoParado.png"));
            if(ImageIO.read(new File(file.getAbsoluteFile()+"\\src\\main\\java\\tacocat\\Sprites\\gatoParado.png")) == null){
               throw new ObjetoNaoEncontradoException();
            }
                    
            this.imageBatendo = ImageIO.read(new File(file.getAbsoluteFile()+"\\src\\main\\java\\tacocat\\Sprites\\gatoBatendo.png"));
            if(ImageIO.read(new File(file.getAbsoluteFile()+"\\src\\main\\java\\tacocat\\Sprites\\gatoBatendo.png"))== null){
                throw new ObjetoNaoEncontradoException();
            }
            
            this.imageParadoflip = ImageIO.read(new File(file.getAbsoluteFile()+"\\src\\main\\java\\tacocat\\Sprites\\gatoParadoflip.png"));
            if(ImageIO.read(new File(file.getAbsoluteFile()+"\\src\\main\\java\\tacocat\\Sprites\\gatoParadoflip.png"))== null){
                throw new ObjetoNaoEncontradoException();
            }    
            
            this.imageBatendoflip = ImageIO.read(new File(file.getAbsoluteFile()+"\\src\\main\\java\\tacocat\\Sprites\\gatoBatendoflip.png"));
            if(ImageIO.read(new File(file.getAbsoluteFile()+"\\src\\main\\java\\tacocat\\Sprites\\gatoBatendoflip.png"))== null){
                throw new ObjetoNaoEncontradoException();
            }    
    }
    
    
    @Override
    public void tick() {
        this.setX(this.getX());
        this.setY(this.getY());
    }

    @Override
    public void render(Graphics g) {

        if(this.isDireita() == false){
            if(isParado() == true){
                g.drawImage(imageParado, this.getX(), this.getY(), null);
            }
            else if(isParado() == false){
                g.drawImage(imageBatendo, this.getX(), this.getY(), null);
            }
        }
        else if(this.isDireita() == true){
            if(isParado() == true){
                g.drawImage(imageParadoflip, this.getX(), this.getY(), null);
            }
            else if(isParado() == false){
                g.drawImage(imageBatendoflip, this.getX(), this.getY(), null);
            }
        }
    }

    @Override
    public void frenesi() {    }


    
    
    
}
