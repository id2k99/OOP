import java.util.Random;

public abstract class Base implements InGameInterface{

    String name;
    int level;
    int health;
    int initiative;
    int defence;
    Coordinates coordinates;
    public void moving(){
        return;
    }


 public Base(int x, int y) {
        this.name =String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        this.level = 1;
        this.coordinates = new Coordinates(x, y);
   }


}
