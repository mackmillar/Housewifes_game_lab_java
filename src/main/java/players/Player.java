package players;

import behaviours.IDamage;
import items.WeaponType;

public abstract class Player  implements IDamage {
    private String name;
    private boolean isAlive;
    private int socialCapitalPoints;
    private WeaponType weaponType;


    public Player(String name, int socialCapitalPoints, WeaponType weaponType){
        this.name = name;
        this.isAlive = true;
        this.socialCapitalPoints = socialCapitalPoints;
        this.weaponType = weaponType;

    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void kill() {
        isAlive = false;
    }

    public int getSocialCapitalPoints() {
        return socialCapitalPoints;
    }

    public void setSocialCapitalPoints(int socialCapitalPoints) {
        this.socialCapitalPoints = socialCapitalPoints;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public void acceptDamage(int damagepoint){
        this.socialCapitalPoints -= damagepoint;
    }

    public void dealDamage(Player player){
       int amount = this.weaponType.getValue();
       player.acceptDamage(amount);
    }
}
