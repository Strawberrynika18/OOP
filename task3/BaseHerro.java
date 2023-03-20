package OOP.task3;

import java.util.Random;
import java.util.ArrayList;


public abstract class BaseHero implements Interface {

    protected Random rnd = new Random();
    
    public int hp;
    private int speed;
    private int maxHp;
    private final String NAME;
    public int damage; 
    private int protection; 
    private Positions position;
    

    public void getNAME() {
        System.out.println(NAME);
    }

    public BaseHero(String name, int hp, int maxHp, int speed, int damage,int protection, int x,int y) {
        NAME = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        this.damage = damage;
        this.protection = protection;
        position = new Positions(x,y);
        
    }

    public void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        } else
            this.hp = 0;
    }

    public void attack(BaseHero target, int damage, int maxDamage) {
        int causedDamage;
        if(damage < target.protection) causedDamage = damage;
        else {
            switch (new Random().nextInt(4)){
                case 0:
                    causedDamage = maxDamage;
                    break;
                default:
                    causedDamage = damage;
                    break;
        }
        }

        System.out.printf("%s атака %s\t", this.getClass().getSimpleName(), target.getClass().getSimpleName());
        System.out.printf("сила атаки = %d\n", causedDamage);
        System.out.printf("%s hp= %d\n", target.getClass().getSimpleName(), target.hp);
        target.getDamage(causedDamage);
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2){
        System.out.println("ход");
    };

    @Override
    public String getInfo() {
        return "";
    }

    public int getSpeed() {
        return this.speed;
    }
}