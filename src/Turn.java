import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.ArrayList;

/**
 * Created by wwessendorp on 4-5-2016.
 */
class Turn {

    protected ArrayList<Integer> turn = new ArrayList<Integer>();

    public Turn(){

    }

    public void addThrow(int score){
        this.turn.add(score);
    }

}