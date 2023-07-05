import java.util.Random;

public class Countryman extends Base{

    public Countryman(int x, int y) {
        super(x,y);
    }
    @Override
    public String getInfo() {
        return "Countryman" + " " + this.name + " " + "Coordinates: " +  this.coordinates;
    }

    @Override
    public void step() {

    }
}
