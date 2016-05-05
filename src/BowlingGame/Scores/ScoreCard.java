package BowlingGame.Scores;

import BowlingGame.Turn;

import java.util.ArrayList;

/**
 * Created by wwessendorp on 26-6-2015.
 */
public class ScoreCard {

    public ArrayList<Turn> turns = new ArrayList<Turn>();

    public void submitTurn(Turn turn){
        this.turns.add(turn);
    }

    public int getNumberOfTurns(){
        return this.turns.size();
    };

    public int getTotalScore() {
        int score = 0;
        for(Turn turn:this.turns){
            score += turn.getNrOfTotalPins();
        }
        return score;
    }

}
