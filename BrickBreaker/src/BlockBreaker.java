import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class BlockBreaker extends JPanel implements KeyListener {

    JFrame mainFrame;
    JFrame startScreen;
    ArrayList<Block> blocks;

    Block ball;
    Block paddle;

    Animate animate;
    Thread th;

    BlockBreaker(JFrame frame, JFrame startScreen){

        reset();
        this.mainFrame = frame;
        this.startScreen = startScreen;


        th = new Thread(() -> {
            while (true){
                update();
                try{
                    Thread.sleep(10);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        });
        th.start();

        reset();
    }

    /**
     * This method is responsible for the ball movements and it keeps track when a block is hit,
     * when the ball hits a wall or the paddle, or it goes below the paddle.
     */

    public void update() {
        ball.x += ball.movX;

        if(ball.x > (getWidth() - 25) || ball.x < 0)
            ball.movX *= -1;

        if(ball.intersects(paddle) || ball.y < 0)
            ball.movY *= -1;

        ball.y += ball.movY;

        if(ball.y > getHeight())
        {
            th = null;
            reset();
            mainFrame.setVisible(false);
            startScreen.setVisible(true);
        }

        blocks.forEach(block -> {
            if(ball.intersects(block) && !block.clear)
            {
                block.clear = true;
                ball.movY *= -1;
            }
        });
        repaint();
    }

    /**
     * This method resets the game when the ball falls below the paddle.
     * It repaints all the initial blocks.
     */

    void reset (){
        blocks = new ArrayList<Block>();

        ball = new Block(237, 435, 25, 25, "ball.png");
        paddle = new Block(173,480, 150, 25, "bar.png");


        for(int i = 0; i < 8; i++)
            blocks.add(new Block(i*60, 0, 60, 50, "blue.png"));
        for(int i = 0; i < 8; i++)
            blocks.add(new Block(i*60, 50, 60, 50, "green.png"));
        for(int i = 0; i < 8; i++)
            blocks.add(new Block(i*60, 100, 60, 50, "orange.png"));

        addKeyListener(this);
        setFocusable(true);
    }

    public void paintComponent(Graphics g){
        ball.draw(g, this);
        blocks.forEach(block -> {
            block.draw(g, this);
        });
        paddle.draw(g, this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * This method is used for moving the paddle to the right or
     * to the left.
     *
     * @param e tells which key has been pressed by the user
     */
    @Override
    public void keyPressed(KeyEvent e) {
    if(e.getKeyCode() == KeyEvent.VK_ENTER) {
        th = new Thread(() -> {
            while (true){
                update();
                try{
                    Thread.sleep(10);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        });
        th.start();
        /*animate = new Animate(this);
        th = new Thread(animate);
        th.start();*/
    }

    if(e.getKeyCode() == KeyEvent.VK_RIGHT && paddle.x < (getWidth() - paddle.width)) {
        paddle.x += 1;
    }

    if(e.getKeyCode() == KeyEvent.VK_LEFT && paddle.x > 0) {
            paddle.x -= 1;
    }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
