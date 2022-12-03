package OOP_less.Less_5.chars;

import OOP_less.Less_5.AnsiColors;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class Spareman extends UnitBase {

    public Spareman(List<UnitBase> gang, List<UnitBase> side, int x, int y) {
        super(4, 5, new int[]{1, 3}, 10, 4, "Stand", "Spareman");
        super.gang = gang;
        super.side = side;
        super.position = new Vector2(x,y);
        quantity = new Random().nextInt(10,15);
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
    public void step(){
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
            if(dist < 2 ){
                side.get(index).getHit(calcDamage(side.get(index)));
            }else {
                Vector2 enemyPos = side.get(index).getPosition();
                Vector2 newPos = new Vector2(0,0);
                if (enemyPos.y == position.y){
                    newPos.y = position.y;
                    if (position.x - enemyPos.x < 0) {
                        newPos.x = position.x + 1;
                    } else {
                        newPos.x = position.x - 1;
                    }

                }else {
                    newPos.x = position.x;
                    if  (enemyPos.y - position.y > 0){
                        newPos.y = position.y + 1;
                    } else {
                        newPos.y = position.y - 1;
                    }
                }
                AtomicBoolean empty = new AtomicBoolean(true);
                gang.forEach(unitBase -> {
                    if (unitBase.getPosition().isEquals(newPos)){
                        empty.set(false);
                    }

                });
                if (empty.get()){
                    position = newPos;
                }

            }

        }

    }

}
