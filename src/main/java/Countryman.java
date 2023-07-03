import java.util.Random;

public class Countryman extends Base{
    public static int count = 1;
    public Countryman() {
        count++;
    }
    @Override
    public String getInfo() {
        return "Countryman" + " " + this.name;
    }
    @Override
    public void step() {

    }
}
