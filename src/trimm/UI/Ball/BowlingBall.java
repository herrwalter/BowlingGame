package trimm.UI.Ball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by wwessendorp on 1-6-2016.
 */
public class BowlingBall extends JComponent implements MouseListener{

    private int x = 50;
    private int y = 50;
    private Graphics g;

    public BowlingBall(){
        this.addMouseListener(this);
        this.setVisible(true);
//
//        Graphics g = this.getGraphics();
    }

    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillOval(x, y, 50, 50);

        g.setColor(Color.WHITE);
        g.fillOval(x + 10, y + 10, 10, 10);
        g.fillOval(x + 17, y + 32, 8, 8);
        g.fillOval(x + 25, y + 25, 8, 8);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        Point point = mouseEvent.getPoint();
        System.out.print(point.getX() + ", " + point.getY());
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
