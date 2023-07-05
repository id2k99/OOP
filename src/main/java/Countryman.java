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
    public double getDistance(int xA,int yA, int xB, int yB) {
        double distance;
        distance = Math.sqrt((xB - xA)^2 + (yB - yA)^2);
        return distance;
    }
    @Override
    public void step() {

    }
}
