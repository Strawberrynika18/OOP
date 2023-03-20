package task3;

public class Positions {
    protected int x;
    protected int y;

    public Positions(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private double distance (int newX, int newY){
        return Math.sqrt(Math.pow(this.x - newX, 2)+ Math.pow(this.y - newY, 2));
    };
}
