package unit;

import java.util.ArrayList;

public class Monk extends Magics {
    protected int hill;
    public void hill(){

        return;
    }
    public Monk(int x, int y) {
        super(x,y);
        super.health = 100;
        super.initiative = 6;
        super.defence = 2;
        this.hill = 20;
    }
    @Override
    public String getInfo() {
        return "Monk" + " " + this.name + " Health " + this.health;
    }

    @Override
    public void step(ArrayList<Base> Owm, ArrayList<Base> Enemy) {
    }
}
