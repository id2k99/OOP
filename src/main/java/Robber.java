public class Robber extends Warriors{
    public static int count = 1;
    public Robber() {
        super("robber" + " "+ count);
        super.health = 100;
        super.initiative = 4;
        super.attack = 5;
        super.defence = 5;
        count++;
    }
}
