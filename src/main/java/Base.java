public abstract class Base {

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
        this.level = 2;
    }
}
