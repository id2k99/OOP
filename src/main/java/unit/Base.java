package unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Base implements InGameInterface{

    protected String name;
    protected int level;
    protected int health;
    protected int initiative;
    protected int defence;
    protected int [] attack;
    protected Coordinates coordinates;

     public Base(int x, int y) {
            this.name =String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
            this.level = 1;
            this.coordinates = new Coordinates(x, y);
       }

    public void attack(ArrayList<Base> teamEnemy){

    }

    public int findNearest(ArrayList<Base> teamEnemy) {
        double minDistance = Coordinates.getDistance(coordinates.x,teamEnemy.get(0).coordinates.x,coordinates.y,
                teamEnemy.get(0).coordinates.y);
        int enemyIndex = 0;

        for (int i = 0; i < teamEnemy.size(); i++) {
            double j = Coordinates.getDistance(coordinates.x,teamEnemy.get(i).coordinates.x,coordinates.y,
                    teamEnemy.get(i).coordinates.y);
            if (j < minDistance) {
                minDistance = j;
                enemyIndex = i;
            }
        }
//        System.out.println(getClass().getName() + " " + name + "- " +
//                teamEnemy.get(enemyIndex).name + " " + minDistance);

        return enemyIndex;
    }

}
