package trimm;

import java.awt.*;
import java.awt.image.BufferStrategy;
import trimm.UI.Window;



public class Game  implements Runnable{

    public static final int WIDTH = 640;
    public static final int HEIGHT = WIDTH / 12 * 9;

    private Thread thread;
    private boolean running;

    public Game(){
        new Window(WIDTH, HEIGHT, "Awesome paint man!!");
    }

    public static void main(String args[]){
        new Game();
    }

    @Override
    public void run() {

    }
}
