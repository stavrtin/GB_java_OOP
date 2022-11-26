package OOP_less.Less_2;

import java.util.List;

public abstract class Unit implements UnitInterface{
    protected int attack;

    protected float health;

    protected final float maxHealth;

    protected int[] damage;
    protected int protect;
    protected int speed;
    protected String status;
    protected List<Unit> gang;

    public Unit(int attack, int protect, int[] damage, float health, int speed, String status){
        this.attack = attack;
        this.damage = damage;
        this.health = health / 2;
        this.maxHealth = health;
        this.speed = speed;
        this.protect = protect;
        this.status = status;

    }

    @Override
    public String getInfo() {
        return "At:" + attack +
                ", Pr:" + protect +
                ", Hl:" + health +
                ", Dm:" + (damage[0] + damage[1])/2+
                ", Sp:" + speed ;
    }

    @Override
    public void step() {

    }
}






























