package OOP_less.Less_2;

public class Xbowman extends Unit {

    private int shoots;

    public Xbowman() {
        super(6, 3, new int[] {2, 3}, 10, 4, "Stand");
        shoots = 16;
    }

    @Override
    public String getInfo() {
        return "Арбалетчик - " + super.getInfo() + " Sh - " + shoots + " Status "  + status ;
    }
}
