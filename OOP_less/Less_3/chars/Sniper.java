package OOP_less.Less_3.chars;

import java.util.List;

public class Sniper extends UnitBase {

    private int shoots;

    public Sniper(List<UnitBase> gang, int x, int y) {
        super(12, 10, new int[] {8, 10}, 30, 9, "Stand", "Sniper");
        shoots = 32;
        super.gang = gang;
        super.position = new Vector2(x,y);
    }

    @Override
    public String getInfo() {
        return "Снайпер" +  '\t'  + super.getInfo() +  '\t'  + "➶ " + shoots;
    }
}
