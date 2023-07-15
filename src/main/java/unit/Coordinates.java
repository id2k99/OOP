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

//    public Coordinates move(ArrayList<Base> Own, ArrayList<Base> Enemy, int numberTeam, int enemyIndex){
//        Coordinates moveCoord = new Coordinates(x,y);
//        int enemyX = Enemy.get(enemyIndex).coordinates.x;
//        int enemyY = Enemy.get(enemyIndex).coordinates.y;
//
//        if(numberTeam == 1 && Own.get().coordinates.x -1 < enemyX){
//            this.coordinates.x +=1;
//        }
//        if (numberTeam == 2 && this.coordinates.x -1 > enemyX) {
//            this.coordinates.x -=1;
//        }
//
//        return moveCoord;
//    }

}
