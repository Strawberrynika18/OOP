package OOP.task2;

public class Crossbowman extends ShooterClass {

    public Crossbowman(String name) {
        super(name, 90, 90, 11, 120, 12);
    }

    @Override
    public void step() {
        System.out.println("арбалетчик атакует!");
    }

    @Override
    public String getInfo() {
        return "Crossbowman";
    }
    
}