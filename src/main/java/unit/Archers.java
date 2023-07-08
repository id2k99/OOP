package unit;

import java.util.ArrayList;

public abstract class Archers extends Base {
    //protected int shot;
    protected int arrows;
    public Archers(int x, int y) {
        super(x,y);
    }
    @Override
    public String getInfo() {
        return null;
    }
    @Override
    public void step(ArrayList<Base> Owm, ArrayList<Base> Enemy) {

    }
}
