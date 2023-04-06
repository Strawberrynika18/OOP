package OOP.task3;

import java.util.ArrayList;

public class ClassPeasant extends BaseHero {

    public int energy = 6;

    public ClassPeasant(String name, int x, int y) {
        super(name, 1,3,1,1,x, y);
        
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        // System.out.println("Очередь Крестьянина!");
    }

    @Override
    public String getInfo() {
        return "Paesant";
    }

}
