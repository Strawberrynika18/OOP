package OOP.task5;

import java.util.Random;
import java.util.ArrayList;


public abstract class BaseHero implements Interface {

    protected Random rnd = new Random();

    public int hp;
    private int maxHp;
    private int speed;
    private final String NAME;
    public int damage; 
    public Positions position;
    private int protection; 


    public void getNAME() {
        System.out.println(NAME);
    }

    public BaseHero(String name, int hp, int speed, int damage,int protection, int x,int y) {
        NAME = name;
        this.hp = hp;
        this.maxHp = hp;
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
        target.getDamage(causedDamage);
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2){
    };

    @Override
    public String getInfo(){
        String outStr = String.format("\t%-3s\tскорость:%-3d\tзащита:%-3d\thp:%-3d\tурон:%-3d\t " , getName(),speed,protection,(int) hp * 100/maxHp,damage);
        return outStr; 
    }

    public int getSpeed() {
        return this.speed;
    }

    public Positions getPosition() {
        return position;
    }

    public static String generateName(){
        return List.values()[new Random().nextInt(List.values().length)].toString();
    }

    public String getName() {
        return "baseHero";
    }
}