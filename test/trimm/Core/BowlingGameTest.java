package trimm.Core;

import trimm.Core.User.User;
import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {

    public BowlingGame getBowlingGame(){
        return new BowlingGame();
    }

    public User getUser(){
        return new User("Wouter");
    }

    public void testCanCreateBowlingGame() {
        BowlingGame bowlingGame = new BowlingGame();
        assertTrue(bowlingGame instanceof BowlingGame);
    }

    public void testUserCanJoinGame() {
        BowlingGame game = getBowlingGame();
        User user = getUser();
        game.joinUser(user);
        TestCase.assertTrue(game.userIsInGame(user));
    }

    public void testUserIsInGame(){
        BowlingGame game = getBowlingGame();
        User user = getUser();
        TestCase.assertFalse(game.userIsInGame(user));
        game.joinUser(user);
        TestCase.assertTrue(game.userIsInGame(user));
    }

    public void testWhenUserJoinsHeGetsAddedAScoreCard(){
        BowlingGame game = getBowlingGame();
        User user = getUser();
        game.joinUser(user);
        assertTrue(user.hasScoreCard());
    }



}