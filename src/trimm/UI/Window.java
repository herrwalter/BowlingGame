package trimm.UI;

import trimm.UI.Screen.FirstScreen;

import javax.swing.*;
import java.awt.*;
;
/**
 * Created by wwessendorp on 1-6-2016.
 */
public class Window extends Canvas{

    public Window(int width, int height, String title) {
        JFrame frame = new JFrame(title);

        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.add(new FirstScreen());
        frame.pack();
    }
}
