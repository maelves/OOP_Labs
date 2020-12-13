import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BlockBreakerView extends JPanel implements KeyListener {

    BlockBreakerView(){
        Block paddle = new Block(173,480, 150, 25, "bar.png");
        addKeyListener(this);
        setFocusable(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
