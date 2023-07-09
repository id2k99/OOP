package unit;

import java.util.ArrayList;

public class Robber extends Warriors{
    public Robber(int x, int y) {
        super(x,y);
        super.health = 100;
        super.initiative = 5;
        super.defence = 5;
        super.attack = 5;

    }
    @Override
    public String getInfo() {
        return "Robber" + " " + this.name + " Health " + this.health;
    }

    @Override
    public void step(ArrayList<Base> Owm, ArrayList<Base> Enemy) {

    }
}
