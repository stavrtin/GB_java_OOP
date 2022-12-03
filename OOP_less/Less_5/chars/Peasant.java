package OOP_less.Less_5.chars;

import OOP_less.Less_5.AnsiColors;

import java.util.List;
import java.util.Random;

public class Peasant extends UnitBase {

    private boolean delivery;

    public Peasant(List<UnitBase> gang, List<UnitBase> side, int x, int y) {
        super(1, 1, new int[] {1, 1}, 1, 3, "Stand", "Peasant");
        delivery = true;
        super.gang = gang;
        super.side = side;
        super.position = new Vector2(x,y);
        quantity = new Random().nextInt(1,6);

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
    public void step (){
        if (action.equals("Занят")){
            this.action = "Стоит";
        }
    }

}




















