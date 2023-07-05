public class Pikerman extends Warriors{

    public Pikerman(int x,int y) {
        super(x,y);
        super.health = 150;
        super.initiative = 4;
        super.defence = 6;
        super.attack = 6;
    }
    @Override
    public String getInfo() {
        return "Pikerman" + " " + this.name + " " + "Coordinates: " +  this.coordinates;
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
