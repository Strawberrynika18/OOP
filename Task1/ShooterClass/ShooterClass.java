package Game.ShooterClass;

import Game.BaseHero;

public class ShooterClass extends BaseHero {
 
    protected int energy;   /* энергия */
    
    protected int dexterity; /*ловкость*/

    public ShooterClass(String name, int hp, int maxHp, int speed, int energy, int dexterity) {
        super(name, hp, maxHp, speed);
        this.energy = energy;
        this.dexterity = dexterity;
    }
    
    
}
