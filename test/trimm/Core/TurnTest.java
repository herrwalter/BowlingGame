package trimm.Core;

import junit.framework.TestCase;

/**
 * Created by wwessendorp on 4-5-2016.
 */
public class TurnTest extends TestCase{

    public void testCanCreateTurn(){
        assertTrue(new Turn() instanceof Turn);
    }

}
