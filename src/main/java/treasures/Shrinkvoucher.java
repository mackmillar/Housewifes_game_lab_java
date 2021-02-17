package treasures;

import behaviours.ITreasure;
import players.Player;

public class Shrinkvoucher implements ITreasure {

    public void bonus(Player player){
        int startingLevel = player.getSocialCapitalPoints();
        int afterTherapy = startingLevel + 50;
        player.setSocialCapitalPoints(afterTherapy);
    }
}
