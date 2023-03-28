package OOP.task5;

public class Snipper extends ShooterClass {

    public Snipper(String name, int x, int y) {
        super(name,15, 9,10,8,10,10,x, y);
    }

    @Override
    public String getName() {
        return "Snipper";
    }
}