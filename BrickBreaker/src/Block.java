import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Block extends Rectangle {
    Image pic;
    boolean clear;

    int posX;
    int posY;

    int width;
    int height;

    Block(int x, int y, int w, int h, String str)
    {
        this.posX = x;
        this.posY = y;
        this.height = h;
        this.width = w;

        try {
            pic = ImageIO.read(new File("src/"+str));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void draw(Graphics g, Component c)
    {
        if(!clear)
            g.drawImage(pic, posX, posY, width, height, c);
    }
}
