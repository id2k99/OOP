public class Countryman extends Base{
    public static int count = 1;
    public Countryman() {
        super("countryman" + " "+ count);
        count++;
    }
    @Override
    public String getInfo() {
        return "Countryman";
    }
    @Override
    public void step() {

    }
}
