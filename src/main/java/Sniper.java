public class Sniper extends Archers{
    int accuracy;
    public static int count = 1;
    public Sniper() {
        super.health = 100;
        super.initiative = 4;
        super.defence = 3;
        super.shot = 5;
        this.accuracy = 1;
        count++;
    }

    @Override
    public String getInfo() {
        return "Sniper" + " " + this.name;
    }
    @Override
    public void step() {
        super.step();
    }
}
