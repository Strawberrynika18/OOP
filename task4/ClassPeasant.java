package OOP.task4;

import java.util.ArrayList;

public class ClassPeasant extends BaseHero {

    public int energy = 6;

    public ClassPeasant(String name) {
        super(name, 1,1,3,1,1,0,0);
        
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
    }

    @Override
    public String getInfo() {
        return "Paesant";
    }
  

}
