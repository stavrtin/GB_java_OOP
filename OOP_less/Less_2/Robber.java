package OOP_less.Less_2;

public class Robber extends Unit {

    public Robber() {
        super(8, 3, new int[] {2, 4}, 10, 6, "Stand");

    }

    @Override
    public String getInfo() {
        return "Разбойник - " + super.getInfo() + " Status "  + status ;
    }
}
