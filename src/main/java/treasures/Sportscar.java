package treasures;

import behaviours.ITreasure;
import players.Player;

public class Sportscar implements ITreasure {

    public void bonus(Player player){
        int startingLevel = player.getSocialCapitalPoints();
        int afterSportscar = startingLevel + 70;
        player.setSocialCapitalPoints(afterSportscar);
    }
}
