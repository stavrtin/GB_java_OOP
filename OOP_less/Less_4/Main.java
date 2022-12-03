package OOP_less.Less_4;

import OOP_less.Less_4.chars.*;

import javax.crypto.spec.PSource;
import java.util.*;

public class Main {
    public static final int GANG_SIZE = 5;
    // ---------- наполняю массив случайными персонажами ------------

    public static List<UnitBase> whiteSide;

    public static List<UnitBase>darkSide;

    public static void main(String[] args) {
        init();

        Scanner scanner = new Scanner(System.in);
        while (true){
            ConsoleView.view();
            turnMove();
//            whiteSide.forEach(n -> n.step());
//            darkSide.forEach(n -> n.step());

            scanner.nextLine();
        }



    }

    private static void init(){
        whiteSide = new ArrayList<>();
        darkSide = new ArrayList<>();

        int x = 1;         int y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0:   whiteSide.add(new Peasant(whiteSide, darkSide,x, y++));                    break;
                case 1:   whiteSide.add(new Robber(whiteSide,darkSide, x, y++));                    break;
                case 2:   whiteSide.add(new Sniper(whiteSide, darkSide,x, y++));                    break;
                default:  whiteSide.add(new Monk(whiteSide, darkSide,x, y++));                    break;
            }
        }

        x = GANG_SIZE;
        y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {

            switch (new Random().nextInt(4)) {
                case 0:    darkSide.add(new Peasant(darkSide, whiteSide, x, y++));  break;
                case 1:    darkSide.add(new Spareman(darkSide, whiteSide, x, y++));   break;
                case 2:    darkSide.add(new Xbowman(darkSide,whiteSide, x, y++));   break;
                default:   darkSide.add(new Wizard(darkSide, whiteSide, x, y++));     break;
            }
            }
    }

    private static void turnMove(){
        //---получаем два списка, сотрируем по скорости и запускаем на степ -------
       List<UnitBase> sortSide = new ArrayList<>();

       sortSide.addAll(whiteSide);
       sortSide.addAll(darkSide);
       sortSide.sort(new Comparator<UnitBase>() {
           @Override
           public int compare(UnitBase o1, UnitBase o2) {
               int tmp = o2.getSpeed() - o1.getSpeed();
               return tmp;
           }
       });
       sortSide.forEach(UnitBase::step);

    }


}






























