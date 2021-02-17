package houses;

import behaviours.ITreasure;
import players.Housewife;
import players.Player;

import java.util.ArrayList;

public class House {

    private ArrayList<ITreasure> treasure;
    private ArrayList<Player> guests;

    public House(){
        this.treasure = new ArrayList<ITreasure>();
        this.guests = new ArrayList<Player>();
    }

    public void addTreasure(ITreasure treasure){
        this.treasure.add(treasure);
    }

    public ArrayList<ITreasure> getTreasure() {
        return treasure;
    }

    public void addGuest(Housewife housewife){
        this.guests.add(housewife);
    }
}
