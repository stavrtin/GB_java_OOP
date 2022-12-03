package OOP_less.Less_4.chars;

import OOP_less.Less_4.AnsiColors;

import java.util.List;

public class Robber extends UnitBase {

    public Robber(List<UnitBase> gang, List<UnitBase> side, int x, int y) {
        super(8, 3, new int[] {2, 4}, 10, 6, "Stand", "Robber");
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
