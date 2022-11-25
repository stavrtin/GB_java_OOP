package OOP_less.Less_1;

public class Sniper extends Unit{

    private int shoots;

    public Sniper() {
        super(12, 10, new int[] {8, 10}, 30, 9, "Stand");
        shoots = 32;
    }

    @Override
    public String toString() {
        return "Снайпер - " + super.toString() + " Sh - " + shoots + " Status "  + status ;
    }
}
