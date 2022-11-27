package OOP_less.Less_3.chars;

import java.util.List;

public class Xbowman extends UnitBase {

    private int shoots;

    public Xbowman(List<UnitBase> gang, int x, int y) {
        super(6, 3, new int[] {2, 3}, 10, 4, "Stand", "Xbowman");
        shoots = 16;
        super.gang = gang;
        super.position = new Vector2(x,y);
    }

    @Override
    public String getInfo() {
        return "Арбалетчик" +  '\t'  + super.getInfo() +  '\t'  + "➶" + shoots;
    }
}
