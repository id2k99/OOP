public abstract class Archers extends Base {
    int shot;
    public void shot(){
        return;
    }
    public Archers(int x, int y) {
        super(x,y);
    }
    @Override
    public String getInfo() {
        return null;
    }


    public double getDistance(int xA, int yA, int xB, int yB) {
        return 0;
    }

    @Override
    public void step() {

    }

}
