import java.util.ArrayList;

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
    public void step(ArrayList<Base> Enemy) {
        super.step(Enemy);
    }
}
