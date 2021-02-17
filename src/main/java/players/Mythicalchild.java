package players;

import behaviours.IDefend;

public class Mythicalchild implements IDefend {
    private String name;
    private double bedTime;
    private int behaviourPoints;

    public Mythicalchild(String name, double bedTime) {
        this.name = name;
        this.bedTime = bedTime;
        this.behaviourPoints = 0;

    }

    public String defend(){
        return "Leave my mummy alone.";
    }
}
