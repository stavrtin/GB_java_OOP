package OOP_less.Less_4.chars;

import OOP_less.Less_4.AnsiColors;

import java.util.List;

public abstract class UnitBase implements UnitInterface {
    protected int attack;
    protected float health;
    protected final float maxHealth;
    protected int[] damage;
    protected int protect;
    protected int speed;
    protected String status;
    protected String name;
    protected String action;

    protected List<UnitBase> gang, side;
    protected Vector2 position;


    public UnitBase(int attack, int protect, int[] damage, float health, int speed, String status, String name){
        this.attack = attack;
        this.damage = damage;
        this.health = health;
        this.maxHealth = health;
        this.speed = speed;
        this.protect = protect;
        this.status = status;
        this.name = name;
        this.action = "Стоит";
    }

    public Vector2 getPosition(){return position;};

    public String getName(){
        return name;}
    public void setAction(String action){
        this.action = action;
        }

    public String getAction(){
        return action;
    }

    public float calcDamage(UnitBase unit){
        if(unit.protect - this.attack == 0) {
            return (this.damage[0] + this.damage[1])/2.0f;
        }
        if(unit.protect - this.attack < 0) {
            return this.damage[1];
        }
        return this.damage[0];
    }

    public void getHit(float damage){
            this.health -= damage;
            if (this.health <= 0){
                this.health = 0;
                this.action = "Мертв";
            }
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String getInfo() {
        String outStr = String.format("⚔ %d\t\uD83D\uDEE1 %d\t♥%.1f\t☠%d", attack,protect,health,(damage[0] + damage[1])/2,speed);

        return outStr + " " + action;

    }

    @Override
    public void step(){
//        int index = 0;
//        float dist = Float.MAX_VALUE;
//        for (int i = 0; i < gang.size(); i++) {
//            if (....){
//                index = i;
//                dist = ....
//            }
//        }
        //position.x++;
    }



}






























