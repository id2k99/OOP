package unit;

import java.util.ArrayList;

public class Countryman extends Base{

    public Countryman(int x, int y) {
        super(x,y);
        super.health = 100;
    }
    @Override
    public String getInfo() {
        return "Countryman" + " " + this.name + " Health " + this.health;
    }

    @Override
    public void step(ArrayList<Base> Owm, ArrayList<Base> Enemy) {

    }
}
