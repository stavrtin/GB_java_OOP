package OOP_less.Less_4.chars;

import OOP_less.Less_4.AnsiColors;

import java.util.List;

public class Wizard extends UnitBase {
    private boolean magic;

    public Wizard(List<UnitBase> gang, List<UnitBase> side, int x, int y) {
        super(17, 12, new int[] {-5, -5}, 30, 9, "Stand", "Wizard");
        magic = true;
        super.gang = gang;
        super.side = side;
        super.position = new Vector2(x,y);
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
