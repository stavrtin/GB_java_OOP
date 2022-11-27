package OOP_less.Less_3.chars;

import java.util.List;

public class Wizard extends UnitBase {
    private boolean magic;

    public Wizard(List<UnitBase> gang, int x, int y) {
        super(17, 12, new int[] {-5, -5}, 30, 9, "Stand", "Wizard");
        magic = true;
        super.gang = gang;
        super.position = new Vector2(x,y);
    }

    @Override
    public String getInfo() {
        return "Колдун "  +  '\t' + super.getInfo()+ "    ";
    }

    @Override
    public void step(List<UnitBase> gang) {
        //------------  переопределяем лечение монаха ------------
        float minHealth = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < gang.size(); i++) {
            if (gang.get(i).health < gang.get(i).maxHealth){
                if (gang.get(i).health < minHealth){
                    minHealth = gang.get(i).health;
                    minIndex = i;
                }
            }
        }
        if (minIndex >= 0) {
            gang.get(minIndex).health -= this.damage[0];
            if (gang.get(minIndex).health > gang.get(minIndex).maxHealth){
                gang.get(minIndex).health = gang.get(minIndex).maxHealth;
            }

        }
    }


}
