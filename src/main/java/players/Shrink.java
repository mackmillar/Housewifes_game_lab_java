package players;

import behaviours.IHeal;

public class Shrink implements IHeal {
    private String name;

    public Shrink(String name){
        this.name = name;
    }

    public void heal(Player player){
        int startingLevel = player.getSocialCapitalPoints();
        int afterTherapy = startingLevel + 50;
        player.setSocialCapitalPoints(afterTherapy);
    }


}
