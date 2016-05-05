package BowlingGame;

import BowlingGame.Scores.ScoreCard;

import java.util.ArrayList;

public class BowlingGame {

    protected ArrayList<User> users = new ArrayList<User>();

    public static void main(String[] args) {

    }

    protected boolean userIsInGame(User user) {
        return this.users.indexOf(user) > -1;
    }

    public boolean joinUser(User user){
        if(userIsInGame(user))  return false;
        this.users.add(user);
        this.addNewScoreCardToUser(user);
        return true;
    }

    protected void addNewScoreCardToUser(User user){
        ScoreCard scoreCard = new ScoreCard();
        user.addScoreCard(scoreCard);
    }

    public void playTurn(){
        for(User user:this.users){
            Turn turn = new Turn();
            int firstThrow = user.throwBall(10);
            turn.addThrow(firstThrow);
            if( firstThrow < 10 ){
                int secondThrow = user.throwBall(10 - firstThrow);
                turn.addThrow(secondThrow);
            }
            writeScoreCard(user, turn);
        }
    }


    private void writeScoreCard(User user, Turn turn) {
        ScoreCard scorecard = user.getScoreCard();
        scorecard.submitTurn(turn);

    }

}
