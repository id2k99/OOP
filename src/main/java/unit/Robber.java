package unit;

import java.util.ArrayList;

public class Robber extends Warriors{
    public Robber(int x, int y) {
        super(x,y);
        super.maxHP = 100;
        super.currentHP = 100;
        super.initiative = 5;
        super.defence = 5;
        super.attack = 5;

    }
    @Override
    public String getInfo() {
        return "Robber" + " " + this.name + " " + this.state +" " + " Health " + this.currentHP;
    }

    @Override
    public void step(ArrayList<Base> Owm, ArrayList<Base> Enemy) {

    }
}
