
import junit.framework.TestCase;

/**
 *
 * Created by wwessendorp on 4-5-2016.
 */
public class AlleyTest extends TestCase {

    public void testCanCreateAlley(){
        assertTrue(new Alley() instanceof Alley);
    }

    public void testAlleyHoldsTenStandingPins(){
        Alley alley = new Alley();
        assertEquals(alley.getNumberOfStandingPins(), 10);
    }


}
