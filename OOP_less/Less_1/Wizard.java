package OOP_less.Less_1;

public class Wizard extends Unit{
    private boolean magic;

    public Wizard() {
        super(17, 12, new int[] {-5, -5}, 30, 9, "Stand");
        magic = true;
    }

    @Override
    public String toString() {
        return "Маг - " + super.toString() + " Mg - " + magic + " Status "  + status ;
    }
}
