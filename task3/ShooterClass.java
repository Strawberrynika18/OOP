package OOP.task3;

import task3.BaseHero;

public abstract class ShooterClass extends BaseHero {
   
  
    protected int arrows;
    protected int maxDamage;

  

    public ShooterClass(String name, int hp, int maxHp, int speed,int arrows,int damage,int maxDamage,int protection) {
        super(name, hp, maxHp, speed, damage, protection, maxDamage, protection);
        this.arrows = arrows;
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> friends){
        if (this.arrows > 0 && this.hp > 0) {
            System.out.println("готов стрелять!");
            for (BaseHero hero : enemies) {
                if (hero.hp > 0) {
                    this.attack(hero, this.damage, this.maxDamage);
                    this.arrows --;
                    break;
                }else
                 System.out.println("пропуск шага");
            }
        }

        System.out.println("кол-во оставшихся стрел:" + String.valueOf(this.arrows));
    
        for (BaseHero hero : friends) {
            if (hero.getInfo().equals("ClassPeasant")) {
                this.arrows++;
                break;
            }   
        }
        System.out.println("кол-во оставшихся стрел:" + String.valueOf(this.arrows));   