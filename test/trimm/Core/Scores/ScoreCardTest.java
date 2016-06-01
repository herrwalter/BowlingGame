package trimm.Core.Scores;

import junit.framework.TestCase;

/**
 * Created by wwessendorp on 26-6-2015.
 */
public class ScoreCardTest extends TestCase {

    public void testCanCreateScoreCard(){
        ScoreCard scoreCard = new ScoreCard();
        assertTrue(scoreCard instanceof ScoreCard);
    }

    public void testCanWriteScoreToScoreCard(){
        ScoreCard scoreCard = new ScoreCard();
        scoreCard.submitTurn(8,2);
    }

}
