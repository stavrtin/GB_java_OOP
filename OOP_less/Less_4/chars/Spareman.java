package OOP_less.Less_4.chars;

import OOP_less.Less_4.AnsiColors;

import java.util.List;

public class Spareman extends UnitBase {

    public Spareman(List<UnitBase> gang, List<UnitBase> side, int x, int y) {
        super(4, 5, new int[]{1, 3}, 10, 4, "Stand", "Spareman");
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
}
