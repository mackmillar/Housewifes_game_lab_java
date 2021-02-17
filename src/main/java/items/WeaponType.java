package items;

import behaviours.IDamage;
import players.Player;

public enum WeaponType {
    SASS(6),
    PASSIVE_AGGRESSION(7),
    HANDBAG(3);

    private  final int value;

    WeaponType(int value){
        this.value = value;
    }


    public int getValue() {
        return value;
    }


}
