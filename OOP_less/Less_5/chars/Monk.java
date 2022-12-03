package OOP_less.Less_5.chars;

import OOP_less.Less_5.AnsiColors;

import java.util.List;
import java.util.Random;

public class Monk extends UnitBase {
    private boolean magic;

    public Monk(List<UnitBase> gang, List<UnitBase> side, int x, int y) {
        super(12, 7, new int[] {-4, -4}, 30, 5, "Stand", "Monk");
        magic = true;
        super.gang = gang;
        super.side = side;
        super.position = new Vector2(x,y);
        quantity = new Random().nextInt(2,5);
          }

    @Override
    public String getInfo() {
        String outPut = "";
        if (super.action.equals("Мертв")){
            outPut = AnsiColors.ANSI_RED + name +  '\t' + super.getInfo()+ "     " + AnsiColors.ANSI_RESET;

        } else outPut = name +  '\t' + super.getInfo()+ "     ";
        return outPut;
    }



    @Override
    public void step() {
        //------------  переопределяем лечение монаха ------------
        double minHealth = Integer.MAX_VALUE;
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
