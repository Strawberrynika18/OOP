package OOP.task4;

import task4.BaseHero;


public abstract class MagClass extends BaseHero {

    protected int mana;

    public MagClass(String name, int hp,int speed, int mana,int damage,int protection, int x, int y) {
        super(name, hp, speed, damage, protection, x, y);
        this.mana = mana;
    
    }
 
    
}