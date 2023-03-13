package OOP.task2;

public class Outlaw extends InfantryClass {

    public Outlaw(String name) {
        super(name, 120,120, 16, 100, 9);
    }

    @Override
    public void step() {
        System.out.println("разбойник атакует!");
    }

    @Override
    public String getInfo() {
        return "Outlaw";
    }

    
    
}