public class Arbalester extends Archers{
    int speed;
    public Arbalester(String name) {
        super(name);
        super.health = 100;
        super.initiative = 4;
        super.defence = 5;
        super.shot = 4;
        this.speed = 1;
    }
}
