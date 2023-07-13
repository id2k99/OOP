package unit;

import java.util.ArrayList;

public class Monk extends Magics {


    public Monk(int x, int y) {
        super(x,y);
        super.maxHP = 100;
        super.currentHP = 100;
        super.initiative = 1;
        super.defence = 2;
    }
    @Override
    public String getInfo() {
        return "Monk" + " " + this.name + " " + this.state +" " + " Health " + this.currentHP;
    }

}
