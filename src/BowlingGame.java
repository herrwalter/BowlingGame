import Scores.ScoreCard;
import User.User;

import java.util.ArrayList;

public class BowlingGame {

    protected ArrayList<User> users = new ArrayList<User>();

    public static void main(String[] args) {
        System.out.println("Hello BowlingGame");
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
            int firstThrow = user.throwBall(10);
            int secondThrow = -1;
            if( firstThrow < 10 ){
                secondThrow = user.throwBall(firstThrow - 10);
            }
            writeScoreCard(user, firstThrow, secondThrow);
        }
    }

    private void writeScoreCard(User user, int firstThrow, int secondThrow) {
        ScoreCard scorecard = user.getScoreCard();

    }

}
