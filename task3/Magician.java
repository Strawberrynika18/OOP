package OOP.task3;

public class Magician extends MagClass {

    public Magician(String name) {
        super(name, 30,30, 9, 1,-5,12);
    }


    @Override
    public String getInfo() {
        return "Magician";
    }

    
}