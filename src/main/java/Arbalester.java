public class Arbalester extends Archers{
    int speed;
    public Arbalester(int x, int y) {
        super(x,y);
        super.health = 100;
        super.initiative = 4;
        super.defence = 5;
        super.shot = 4;
        this.speed = 1;
    }

    @Override
    public String getInfo() {
        return "Arbalester" + " " + this.name + " " + "Coordinates: " +  this.coordinates;
    }

    @Override
    public double getDistance(int xA,int yA, int xB, int yB) {
        double distance;
        distance = Math.sqrt((xB - xA)^2 + (yB - yA)^2);
        return distance;
    }

    @Override
    public void step() {
        super.step();
    }


}
