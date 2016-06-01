package trimm.Core.User;

import trimm.Core.Scores.ScoreCard;

import java.util.Random;

/**
 * Created by wwessendorp on 26-6-2015.
 */
public class User {

    protected String name;
    protected ScoreCard scoreCard;

    public User(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void addScoreCard(ScoreCard scoreCard){
        this.scoreCard = scoreCard;
    }

    public boolean hasScoreCard(){
        return this.scoreCard != null;
    }

    public int throwBall(int max){
        Random rand = new Random();
        return rand.nextInt(max);
    }

    public ScoreCard getScoreCard(){
        return this.scoreCard;
    }

}
