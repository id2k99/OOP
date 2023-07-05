public class Magics extends Base{
        int mana;
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
    public double getDistance(int xA, int yA, int xB, int yB) {
        return 0;
    }
    @Override
    public void step() {

    }
}
