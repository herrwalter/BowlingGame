package trimm.Core;

import trimm.Core.Scores.ScoreCard;
import trimm.Core.User.User;

import java.util.ArrayList;

public class BowlingGame {

    protected ArrayList<User> users = new ArrayList<User>();


    protected boolean userIsInGame(User user) {
        return this.users.contains(user);
    }

    public void joinUser(User user){
        if(!userIsInGame(user))
        {
            this.users.add(user);
            this.addNewScoreCardToUser(user);
        }
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
