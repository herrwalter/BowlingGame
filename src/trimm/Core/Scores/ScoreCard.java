package trimm.Core.Scores;

import java.util.ArrayList;

/**
 * Created by wwessendorp on 26-6-2015.
 */
public class ScoreCard {

    public ArrayList<int[]> scores = new ArrayList<int[]>();

    public ScoreCard() {

    }

    public void submitTurn(int firstThrow, int secondThrow){
        int[] score = new int[]{firstThrow, secondThrow};
        this.scores.add(score);
    }

}
