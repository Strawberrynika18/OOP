package OOP.task2;

import task2.BaseHero;

public abstract class ShooterClass extends BaseHero {
   
  
    protected int energy;
   
    protected int dexterity;

    public ShooterClass(String name, int hp, int maxHp, int speed, int energy, int dexterity) {
        super(name, hp, maxHp, speed);
        this.energy = energy;
        this.dexterity = dexterity;
    }
    
    
}