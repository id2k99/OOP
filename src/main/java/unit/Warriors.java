package unit;

import java.util.ArrayList;

public abstract class Warriors extends Base{
    protected int attack;
    public void attack(){

        return;
    }
    public Warriors(int x, int y) {
        super(x, y);
    }

    @Override
    public void step(ArrayList<Base> Enemy) {

    }
}
