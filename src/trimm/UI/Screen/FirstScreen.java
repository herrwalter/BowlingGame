package trimm.UI.Screen;

import trimm.UI.Ball.BowlingBall;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FirstScreen extends BaseScreen {


    private Graphics g;

    private BowlingBall ball;

    protected void paintComponent(Graphics g) {

        g.setColor(Color.green);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        ball = new BowlingBall();
        ball.setVisible(true);
        this.add(ball);
        ball.setBounds(10, 10, 100, 100);
    }

}
