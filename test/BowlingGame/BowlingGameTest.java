package BowlingGame;

import BowlingGame.User;
import junit.framework.TestCase;
import BowlingGame.BowlingGame;

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
        assertTrue(game.joinUser(user));
    }

    public void testJoinGameReturnsFalseWhenUserExists(){
        BowlingGame game = getBowlingGame();
        User user = getUser();
        game.joinUser(user);
        assertFalse(game.joinUser(user));
    }

    public void testUserIsInGame(){
        BowlingGame game = getBowlingGame();
        User user = getUser();
        assertFalse(game.userIsInGame(user));
        game.joinUser(user);
        assertTrue(game.userIsInGame(user));
    }

    public void testWhenUserJoinsHeGetsAddedAScoreCard(){
        BowlingGame game = getBowlingGame();
        User user = getUser();
        game.joinUser(user);
        assertTrue(user.hasScoreCard());
    }





}