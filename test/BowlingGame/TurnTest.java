package BowlingGame;

import junit.framework.TestCase;

/**
 * Created by wwessendorp on 4-5-2016.
 */
public class TurnTest extends TestCase{

    public void testCanCreateTurn(){
        assertTrue(new Turn() instanceof Turn);
    }

    public void testCanAddThrow(){
        Turn turn = new Turn();
        turn.addThrow(6);
    }

    public void testCanGetTheTotalNumberOfThrows(){
        Turn turn = new Turn();
        turn.addThrow(4);
        assertTrue(turn.getNrOfThrows() == 1);
        turn.addThrow(5);
        assertTrue(turn.getNrOfThrows() == 2);
    }

    public void testCanGetTotalNumberOfPinsThrown(){
        Turn turn = new Turn();
        turn.addThrow(3);
        turn.addThrow(4);
        assertEquals(7, turn.getNrOfTotalPins());
    }

}
