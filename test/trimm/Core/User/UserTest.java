package trimm.Core.User;

import trimm.Core.Scores.ScoreCard;
import junit.framework.TestCase;

/**
 * Created by wwessendorp on 26-6-2015.
 */
public class UserTest extends TestCase {

    public void testCanGetName(){
        User user = new User("wouter");
        assertEquals("wouter", user.getName());
    }

    public void testCanAddScoreCard(){
        User user = new User("wouter");
        ScoreCard scoreCard = new ScoreCard();
        assertFalse(user.hasScoreCard());
        user.addScoreCard(scoreCard);
        assertTrue(user.hasScoreCard());
    }

    public void testUserCanThrowABallWithAGoal(){
        User user = new User("Wouter");
        int throwBall = user.throwBall(5);
        assertTrue(throwBall <= 5 && throwBall > -1);
    }

}
