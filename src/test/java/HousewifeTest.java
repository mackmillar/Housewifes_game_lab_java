import items.WeaponType;
import org.junit.Before;
import org.junit.Test;
import players.Housewife;
import players.Mythicalchild;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class HousewifeTest {

    Housewife housewife;
    Mythicalchild mythicalchild;

    @Before
    public void before(){
        mythicalchild = new Mythicalchild("Bruce", 18.00);
        housewife = new Housewife("Bree Van de Kamp", 100, WeaponType.HANDBAG, mythicalchild);
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

    @Test
    public void canKill() {
        housewife.kill();
        assertFalse(housewife.isAlive());
    }

    @Test
    public void canSetSocialCapitalPoints(){
        housewife.setSocialCapitalPoints(150);
        assertEquals(150, housewife.getSocialCapitalPoints());
    }

    @Test
    public void canAcceptDamage(){
        housewife.acceptDamage(50);
        assertEquals(50, housewife.getSocialCapitalPoints());
    }

    @Test
    public void canChangeWeapon() {
        housewife.setWeaponType(WeaponType.SASS);
        assertEquals(WeaponType.SASS, housewife.getWeaponType());
    }

    @Test
    public void hasMythicalChild() {
       assertEquals(mythicalchild ,housewife.getMythicalChild());
    }
}

