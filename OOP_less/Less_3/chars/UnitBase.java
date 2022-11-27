package OOP_less.Less_3.chars;

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

    protected List<UnitBase> gang;
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

    }

    public Vector2 getPosition(){return position;};

    public String getName(){return name;};

    @Override
    public String getInfo() {
        String outStr = String.format("⚔ %d\t\uD83D\uDEE1 %d\t♥%.1f\t☠%d", attack,protect,health,(damage[0] + damage[1])/2,speed);

        return outStr;

    }

    @Override
    public void step(List<UnitBase> gang){
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






























