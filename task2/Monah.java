package OOP.task2;

public class Monah extends MagClass {

    public Monah(String name) {
        super(name, 110, 110, 10, 125, 9);
    }

    @Override
    public void step() {
        System.out.println("монах атакует!");
    }

    @Override
    public String getInfo() {
        return "Monah";
    }

    
}
