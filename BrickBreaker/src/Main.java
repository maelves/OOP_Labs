import javax.swing.*;

/**
 * This a Brick Breaker or Wall Breaker type of game in which
 * the user has to break all blocks while managing to keep the ball
 * above the paddle.
 *
 * @author  Nicoara Marusea Ioana
 *
 */

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Brick Braker");
        JButton start = new JButton("Start Game");
        JFrame startScreen = new JFrame();

        start.addActionListener(listener -> {
            startScreen.setVisible(false);
            frame.setVisible(true);
        });

        BlockBreaker panel = new BlockBreaker(frame, startScreen);

        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(false);
        frame.setSize(500, 600);
        frame.setResizable(false);


        startScreen.getContentPane().add(start);
        startScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startScreen.setVisible(true);
        startScreen.setSize(500, 600);
        startScreen.setResizable(false);
    }
}
