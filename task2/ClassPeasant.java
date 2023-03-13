package OOP.task2;

public class ClassPeasant extends BaseHero {

    public int energy = 6;

    public ClassPeasant(String name) {
        super(name,60,60,4);
        
    }

    @Override
    public void step() {
        System.out.println("Крестьянин!");
    }

    @Override
    public String getInfo() {
        return "Paesant";
    }
  

}
