package OOP_less.Less_3.chars;

import java.util.List;

public class Spareman extends UnitBase {

    public Spareman(List<UnitBase> gang, int x, int y) {
        super(4, 5, new int[]{1, 3}, 10, 4, "Stand", "Spareman");
        super.gang = gang;
        super.position = new Vector2(x,y);
    }

    @Override
    public String getInfo() {
        return "Копейщик"  +  '\t'  + super.getInfo()+ "    " ;
    }
}
