public abstract class Base implements InGameInterface{

    String name;
    int level;
    int health;
    int initiative;
    int defence;
    public void moving(){
        return;
    }


 public Base(String name) {
        this.name = name;
        this.level = 1;
   }

}
