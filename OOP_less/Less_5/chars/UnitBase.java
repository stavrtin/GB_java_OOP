package OOP_less.Less_5.chars;

import java.util.List;
import java.util.Random;

public abstract class UnitBase implements UnitInterface {
    protected int attack;
    protected double health;
    protected final float maxHealth;
    protected int[] damage;
    protected int protect;
    protected int speed;
    protected String status;
    protected String name;
    protected String action;

    protected List<UnitBase> gang, side;
    protected Vector2 position;

    protected int quantity;




    public UnitBase(int attack, int protect, int[] damage, float health, int speed, String status, String name){
        this.attack = attack;
        this.damage = damage;
//        this.health = health;
        this.maxHealth = health;
        this.speed = speed;
        this.protect = protect;
        this.status = status;
        this.name = name;
        this.action = "Стоит";
        quantity = new Random().nextInt(1, 21);
        this.health = health * quantity;


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
            return ((this.damage[0] + this.damage[1])/2.0f) * quantity ;
        }
        if(unit.protect - this.attack < 0) {
            return this.damage[1] * quantity;
        }
        return this.damage[0] * quantity;
    }

    public void getHit(float damage){
        double tempHealth =  (quantity - 1) *  this.maxHealth + health;
        tempHealth -= damage;
        if (tempHealth <= 0){
            this.health = 0;
            this.action = "Мертв";
        } else {
            quantity = (int)(tempHealth / maxHealth);
            health = maxHealth;
            if (tempHealth % maxHealth > 0){
                quantity++;
                health = tempHealth % maxHealth;
            }
        }
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String getInfo() {
        String outStr = String.format("⚔ %d\t\uD83D\uDEE1 %d\t♥%.1f\t☠%d", attack,protect,health,(damage[0] + damage[1])/2,speed);

        return outStr + " " + action + " ШТУК:  " +quantity;

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






























