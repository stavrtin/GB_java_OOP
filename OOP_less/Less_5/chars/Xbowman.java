package OOP_less.Less_5.chars;

import OOP_less.Less_5.AnsiColors;

import java.util.List;
import java.util.Random;

public class Xbowman extends UnitBase {

    private int shoots;

    public Xbowman(List<UnitBase> gang, List<UnitBase> side, int x, int y) {
        super(6, 3, new int[] {2, 3}, 10, 4, "Stand", "Xbowman");
        shoots = 16;
        super.gang = gang;
        super.side = side;
        super.position = new Vector2(x,y);
        quantity = new Random().nextInt(2,7);
    }

    @Override
    public void step(){
        for (UnitBase unit: super.gang) {
            if (unit.getName().equals("Peasant")){
                if (!unit.getAction().equals("Занят") && !unit.getAction().equals("Мертв")){
                    shoots++;
                    unit.setAction("Занят");
                    break;
                }
            }
        }
        if (shoots > 0){
            double dist = Double.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < side.size(); i++) {
                double tmp = side.get(i).getPosition().getDistance(this.position);
                if (dist > tmp && !side.get(i).getAction().equals("Мертв")){
                    dist = tmp;
                    index = i;
                }
            }

            if (index >= 0){
                side.get(index).getHit(speed > dist ? calcDamage(side.get(index)): calcDamage(side.get(index)) / 2);
                shoots--;

            }

        }
    }


    @Override
    public String getInfo() {
        String outPut = "";
        if (super.action.equals("Мертв")){
            outPut = AnsiColors.ANSI_RED +  name +  '\t'  + super.getInfo() +  '\t'  + "➶ " + shoots + AnsiColors.ANSI_RESET;

        } else outPut = name +  '\t'  + super.getInfo() +  '\t'  + "➶ " + shoots;
        return outPut;
    }
}
