public class Monk extends Magics {
    int hill;
    public static int count = 1;
    public void hill(){

        return;
    }
    public Monk() {
        super.health = 100;
        super.initiative = 4;
        super.defence = 1;
        this.hill = 20;
        count++;
    }
    @Override
    public String getInfo() {
        return "Monk" + " " + this.name;
    }
    @Override
    public void step() {

    }
}
