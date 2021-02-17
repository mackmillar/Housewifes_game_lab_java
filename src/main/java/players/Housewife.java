package players;

import houses.House;
import items.WeaponType;

public class Housewife extends Player{

    private Mythicalchild mythicalChild;

    public Housewife(String name, int socialCapitalPoints, WeaponType weaponType, Mythicalchild mythicalChild){
        super(name, socialCapitalPoints, weaponType);
        this.mythicalChild = mythicalChild;

    }

    public void enterHouse(House house){
        house.addGuest(this);
    }

    public Mythicalchild getMythicalChild() {
        return mythicalChild;
    }
}
