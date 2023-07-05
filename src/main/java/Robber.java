public class Robber extends Warriors{
    public Robber(int x, int y) {
        super(x,y);
        super.health = 100;
        super.initiative = 4;
        super.defence = 5;
        super.attack = 5;

    }
    @Override
    public String getInfo() {
        return "Robber" + " " + this.name + " " + "Coordinates: " +  this.coordinates;
    }

    @Override
    public void step() {

    }
}
