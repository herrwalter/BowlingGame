package BowlingGame;

import java.util.ArrayList;

/**
 * Created by wwessendorp on 4-5-2016.
 */
public class Turn {

    protected ArrayList<Integer> allThrows = new ArrayList<Integer>();

    public void addThrow(int pinsHit){
        allThrows.add(pinsHit);
    }

    public int getNrOfThrows(){
        return allThrows.size();
    }

    public int getNrOfTotalPins() {
        int totalPins = 0;
        for(int i:this.allThrows){
            totalPins += i;
        }
        return totalPins;
    }
}