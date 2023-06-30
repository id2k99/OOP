public class Monk extends Magics {
    int hill;
    public Monk(String name) {
        super(name);
        super.health = 100;
        super.initiative = 4;
        super.defence = 1;
        this.hill = 20;
    }
}
