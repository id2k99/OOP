package unit;

import java.util.ArrayList;

public class Sniper extends Archers{
    protected int accuracy;
    public Sniper(int x, int y) {
        super(x,y);
        super.health = 100;
        super.initiative = 4;
        super.defence = 3;
        super.shot = 5;
        this.accuracy = 1;
    }

    @Override
    public String getInfo() {
        return "Sniper" + " " + this.name + " " + "Coordinates: " +  this.coordinates;
    }

    @Override
    public void step(ArrayList<Base> Enemy) {
        super.step(Enemy);
    }
}
