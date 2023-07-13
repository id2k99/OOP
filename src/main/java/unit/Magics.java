package unit;

import java.util.ArrayList;

public class Magics extends Base{
        protected int mana;
    public static int count = 1;
        public Magics(int x, int y) {
            super(x, y);
            this.mana = 100;
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public void step(ArrayList<Base> Owm, ArrayList<Base> Enemy) {

    }


}
