import items.WeaponType;
import org.junit.Before;
import org.junit.Test;
import players.Housewife;

import static org.junit.Assert.assertEquals;


public class HousewifeTest {

    Housewife housewife;

    @Before
    public void before(){
        housewife = new Housewife("Bree Van de Kamp", 100, WeaponType.HANDBAG );
    }

    @Test
    public void hasName() {
        assertEquals("Bree Van de Kamp", housewife.getName());
    }

    @Test
    public void hasSocialPoints() {
        assertEquals(100, housewife.getSocialCapitalPoints());
    }

    @Test
    public void hasWeapon() {
        assertEquals(WeaponType.HANDBAG, housewife.getWeaponType());
    }
}
