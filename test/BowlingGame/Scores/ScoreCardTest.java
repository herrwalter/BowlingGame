package BowlingGame.Scores;

import junit.framework.TestCase;
import BowlingGame.Turn;
import BowlingGame.Scores.ScoreCard;
/**
 * Created by wwessendorp on 26-6-2015.
 */
public class ScoreCardTest extends TestCase {

    public void testCanCreateScoreCard(){
        ScoreCard scoreCard = new ScoreCard();
        assertTrue(scoreCard instanceof ScoreCard);
    }

    public Turn getTurn(int firstThrow, int secondThrow){
        Turn turn = new Turn();
        turn.addThrow(firstThrow);
        turn.addThrow(secondThrow);
        return turn;
    }

    public void testCanWriteScoreToScoreCard(){
        ScoreCard scoreCard = new ScoreCard();
        Turn turn = getTurn(3,4);
        scoreCard.submitTurn(turn);
        assertTrue(scoreCard.getNumberOfTurns() == 1);
    }

    public void testCanGetTheTotalScore(){
        ScoreCard scoreCard = new ScoreCard();
        Turn turn = getTurn(7,2);
        scoreCard.submitTurn(turn);
        assertEquals(9, scoreCard.getTotalScore());
    }

    public void testCanThrowSpare(){
        ScoreCard scoreCard = new ScoreCard();
        Turn turn = getTurn(8,2);
        scoreCard.submitTurn(turn);
        assertEquals(0, scoreCard.getTotalScore());
    }

}
