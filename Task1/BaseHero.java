
public class BaseHero {
    // private static int number;
    // private static Random r;

    private String name;
    private int hp;
    private int maxHp;
    private int speed;


    public BaseHero(String name, int hp, int maxHp, int speed) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "BaseHero [name=" + name + ", hp=" + hp + ", maxHp=" + maxHp + ", speed=" + speed + "]";
    }


    // static {
    //     BaseHero.number = 0;
    //     BaseHero.r = new Random();
    // }

   
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }

