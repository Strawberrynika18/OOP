package OOP.task3;

public class Snipper extends ShooterClass {

    public Snipper(String name) {
        super(name,15,15,9,10,8,10,10);
    }


    @Override
    public String getInfo() {
        return "Snipper";
    }

}