package unit;

import java.util.ArrayList;

public class Countryman extends Base{

    public Countryman(int x, int y) {
        super(x,y);
        super.maxHP = 100;
        super.currentHP = 100;
        super.initiative = 2;
        super.state = "Free";
    }
    @Override
    public String getInfo() {
        return "Countryman" + " " + this.name + " " + this.state +" " + " Health " + this.currentHP;
    }

    @Override
    public void step(ArrayList<Base> Owm, ArrayList<Base> Enemy) {
        if(this.currentHP > 0){this.state = "Free";}

    }
}
