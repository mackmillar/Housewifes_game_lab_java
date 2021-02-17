import com.sun.beans.WeakCache;
import items.WeaponType;
import org.junit.Before;
import org.junit.Test;
import players.Housewife;
import players.Mythicalchild;
import players.Shrink;

import static org.junit.Assert.assertEquals;

public class ShrinkTest {
    Shrink shrink;
    Housewife housewife;
    Mythicalchild mythicalchild;

    @Before
    public void before(){
        shrink = new Shrink("Toby");
        mythicalchild = new Mythicalchild("Julie", 20.00);
        housewife = new Housewife("Susan", 200, WeaponType.PASSIVE_AGGRESSION, mythicalchild);
    }

    @Test
    public void canHeal(){
        shrink.heal(housewife);
        assertEquals(250, housewife.getSocialCapitalPoints());
    }
}
