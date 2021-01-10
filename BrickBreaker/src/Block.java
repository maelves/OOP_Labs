import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Block extends Rectangle {
    Image pic;
    boolean clear;

    int movX;
    int movY;

    Block(int x, int y, int w, int h, String str)
    {
        this.x = x;
        this.y = y;
        this.height = h;
        this.width = w;

        movX = 3;
        movY = 3;

        try {
            pic = ImageIO.read(new File("src/"+str));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void draw(Graphics g, Component c)
    {
        if(!clear)
            g.drawImage(pic, x, y, width, height, c);
    }
}
