package OOP_less.Less_2;

public class Spareman extends Unit {

    public Spareman() {
        super(4, 5, new int[] {1, 3}, 10, 4, "Stand");

    }

    @Override
    public String getInfo() {
        return "Копейщик - " + super.getInfo() + " Status "  + status ;
    }
}
