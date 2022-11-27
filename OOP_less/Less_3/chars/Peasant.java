package OOP_less.Less_3.chars;

import java.util.List;

public class Peasant extends UnitBase {

    private boolean delivery;

    public Peasant(List<UnitBase> gang, int x, int y) {
        super(1, 1, new int[] {1, 1}, 1, 3, "Stand", "Peasant");
        delivery = true;
        super.gang = gang;
        super.position = new Vector2(x,y);
    }

    @Override
    public String getInfo() {
        return "Крестьян" +  '\t' + super.getInfo()+ "     ";
    }
}




















