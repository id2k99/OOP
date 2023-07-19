package unit;

import java.util.ArrayList;

public class Coordinates{
    protected int x;
    protected int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x: %d, y: %d", x,y);
    }

    public double getDistance(int enemyX, int enemyY){
        return Math.sqrt(Math.pow(enemyX-this.x,2)+Math.pow(enemyY-this.y,2));
    }


}
