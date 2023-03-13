package OOP.task2;

public class Magician extends MagClass {

    public Magician(String name) {
        super(name, 80, 80, 6, 200, 14);
    }

    @Override
    public void step() {
        System.out.println(" атака магов!");
    }

    @Override
    public String getInfo() {
        return "Magician";
    }

    
}