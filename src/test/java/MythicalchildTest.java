import org.junit.Before;
import org.junit.Test;
import players.Mythicalchild;

import static org.junit.Assert.assertEquals;

public class MythicalchildTest {

    Mythicalchild mythicalchild;

    @Before
    public void before(){
        mythicalchild = new Mythicalchild("Andrew", 19.00);
    }

    @Test
    public void canDefend(){
       assertEquals("Leave my mummy alone.", mythicalchild.defend());
    }
}
