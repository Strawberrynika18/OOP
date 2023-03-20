package OOP.task3;

public class Crossbowman extends ShooterClass {

    public Crossbowman(String name) {
        super(name,10, 10,4, 10,2,3, 3);
    }


    @Override
    public String getInfo() {
        return "Crossbowman";
    }
    
}