public class Arbalester extends Archers{
    int speed;
    public static int count = 1;
    public Arbalester() {
        super.health = 100;
        super.initiative = 4;
        super.defence = 5;
        super.shot = 4;
        this.speed = 1;
        count++;
    }

    @Override
    public String getInfo() {
        return "Arbalester" + " " + this.name;
    }
    @Override
    public void step() {
        super.step();
    }
}
