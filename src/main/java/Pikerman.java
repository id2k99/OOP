public class Pikerman extends Warriors{

    public static int count = 1;
    public Pikerman() {
        super("pikerman" + " "+ count);
        super.level = 1;
        super.health = 150;
        super.initiative = 4;
        super.attack = 6;
        super.defence = 6;
        count++;
    }
    @Override
    public String getInfo() {
        return "Pikerman";
    }
    @Override
    public void step() {

    }
}
