public class Monk extends Magics {
    int hill;
    public void hill(){

        return;
    }
    public Monk(int x, int y) {
        super(x,y);
        super.health = 100;
        super.initiative = 4;
        super.defence = 1;
        this.hill = 20;
    }
    @Override
    public String getInfo() {
        return "Monk" + " " + this.name + " " + "Coordinates: " +  this.coordinates;
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
