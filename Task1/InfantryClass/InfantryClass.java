package Game.InfantryClass;

import Game.BaseHero;

public class InfantryClass extends BaseHero {

    protected int energy;
    protected int power;

    public InfantryClass(String name, int hp, int maxHp, int speed, int energy, int power) {
        super(name, hp, maxHp, speed);
        this.energy = energy;
        this.power = power;

    }    
}