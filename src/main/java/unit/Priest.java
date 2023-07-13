package unit;

import java.util.ArrayList;
import java.util.Random;

public class Priest extends Magics{



    public Priest(int x, int y) {
        super(x,y);
        super.maxHP = 100;
        super.currentHP = 100;
        super.initiative = 1;
        super.defence = 1;
    }
    @Override
    public String getInfo() {
        return "Priest" + " " + this.name + " " + this.state +" " + " Health " + this.currentHP;
    }
}