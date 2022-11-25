package OOP_less.Less_1;

public class Unit {
    protected int attack;

    protected float health;
    protected int[] damage;
    protected int protect;
    protected int speed;
    protected String status;

    public Unit(int attack, int protect, int[] damage, float health, int speed, String status){
        this.attack = attack;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.protect = protect;
        this.status = status;

    }

    @Override
    public String toString() {
        return "At:" + attack +
                ", Pr:" + protect +
                ", Hl:" + health +
                ", Dm:" + (damage[0] + damage[1])/2+
                ", Sp:" + speed ;

    }
}






























