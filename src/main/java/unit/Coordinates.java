package unit;

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

    public static double getDistance(int x1, int x2, int y1, int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }

}
