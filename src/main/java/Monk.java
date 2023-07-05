import java.util.ArrayList;

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
    public void step(ArrayList<Base> Enemy) {
        super.step(Enemy);
    }
}
