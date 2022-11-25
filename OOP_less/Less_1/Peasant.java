package OOP_less.Less_1;

public class Peasant extends Unit{

    private boolean delivery;

    public Peasant() {
        super(1, 1, new int[] {1, 1}, 1, 3, "Stand");
        delivery = true;

    }

    @Override
    public String toString() {
        return "Крестьянин - " + super.toString() + " Доставка " + delivery + " Status "  + status ;
    }
}




















