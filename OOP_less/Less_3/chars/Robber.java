package OOP_less.Less_3.chars;

import java.util.List;

public class Robber extends UnitBase {

    public Robber(List<UnitBase> gang, int x, int y) {
        super(8, 3, new int[] {2, 4}, 10, 6, "Stand", "Robber");
        super.gang = gang;
        super.position = new Vector2(x,y);

    }

    @Override
    public String getInfo() {
        return "Разбойн" +  '\t'  + super.getInfo()+ "     ";
    }
}
