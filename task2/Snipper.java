package OOP.task2;

public class Snipper extends ShooterClass {

    public Snipper(String name) {
        super(name, 80,80,10,75,8);
    }

    @Override
    public void step() {
        System.out.println("Cнайпер выстреливает!");
    }

    @Override
    public String getInfo() {
        return "Snipper";
    }

}