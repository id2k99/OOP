public class Sniper extends Archers{
    int accuracy;
    public Sniper(String name) {
        super(name);
        super.level = 1;
        super.health = 100;
        super.initiative = 4;
        super.defence = 3;
        super.shot = 5;
        this.accuracy = 1;
    }
}
