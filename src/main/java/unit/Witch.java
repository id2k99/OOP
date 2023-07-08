package unit;

import java.util.ArrayList;

public class Witch extends Magics{

    protected int magicAttack;
    public void magicAttack(){

        return;
    }
    public Witch(int x, int y) {
        super(x,y);
        super.health = 100;
        super.initiative = 4;
        super.defence = 1;
        this.magicAttack = 7;
    }
    @Override
    public String getInfo() {
        return "Witch" + " " + this.name + " Health " + this.health;
    }


    @Override
    public void step(ArrayList<Base> Owm, ArrayList<Base> Enemy) {

    }
}
