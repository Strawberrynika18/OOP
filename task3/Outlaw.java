package OOP.task3;

public class Outlaw extends InfantryClass {

    public Outlaw(String name) {
        super(name,10, 10,6,4,3);
    }



    @Override
    public String getInfo() {
        return "Outlaw";
    }

    
    
}