package players;

import houses.House;
import items.WeaponType;

public class Neighbour extends Player {

        private House house;

    public Neighbour(String name, int socialCapitalPoints, WeaponType weaponType){
        super(name, socialCapitalPoints, weaponType);
        this.house = new House();
    }

    public String attack(Player player, WeaponType weapontype){
        player.acceptDamage(weapontype.getValue());
        return "Take That!";
    }


}
