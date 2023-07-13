package unit;

import java.util.ArrayList;

public class Pikerman extends Warriors{

    public Pikerman(int x,int y) {
        super(x,y);
        super.maxHP = 150;
        super.currentHP = super.maxHP;
        super.initiative = 4;
        super.defence = 6;
        super.attack = 6;
    }
    @Override
    public String getInfo() {
        return "Pikerman" + " " + this.name + " " + this.state +" " + " Health " + this.currentHP;
    }

    @Override
    public void step(ArrayList<Base> Owm, ArrayList<Base> Enemy) {

    }
}
