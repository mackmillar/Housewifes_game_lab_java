package treasures;

import behaviours.ITreasure;
import players.Player;

public class Botox implements ITreasure {

    public void bonus(Player player){
        int startingLevel = player.getSocialCapitalPoints();
        int afterBotox = startingLevel + 30;
        player.setSocialCapitalPoints(afterBotox);
    }
}
