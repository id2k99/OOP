import java.util.Random;

public abstract class Base implements InGameInterface{

    String name;
    int level;
    int health;
    int initiative;
    int defence;
    public void moving(){
        return;
    }


 public Base() {
        this.name =String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        this.level = 1;
   }


}
