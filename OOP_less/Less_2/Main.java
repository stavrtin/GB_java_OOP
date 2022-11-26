package OOP_less.Less_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final int GANG_SIZE = 4;
    // ---------- наполняю массив случайными персонажами ------------
    public static void main(String[] args) {
        List<Unit> whiteSide = new ArrayList<>();
        List<Unit> blackSide = new ArrayList<>();
        while (whiteSide.size() < GANG_SIZE){
            whiteSide.add(random_get_unit(0, whiteSide));
            blackSide.add(random_get_unit(3, blackSide));

        }
        whiteSide.forEach(unit -> System.out.println(unit.getInfo()));
        System.out.println();
        blackSide.forEach(unit -> System.out.println(unit.getInfo() ));
        System.out.println("--------------------------------");
        whiteSide.forEach(Unit::step);
        blackSide.forEach(Unit::step);
        whiteSide.forEach(unit -> System.out.println(unit.getInfo()));
        System.out.println();
        blackSide.forEach(unit -> System.out.println(unit.getInfo() ));

    }

    private static Unit random_get_unit(int origin, List<Unit> side) {
        // ---------- Генерируем случайный выбор ПЕРСОНАЖА из 7 вариантови ------------
        int num = new Random().nextInt(origin, origin + 4);
        switch (num) {
            case 0:  return new Wizard(side);
            case 1:  return new Robber();
            case 2:  return new Sniper();
            case 3:  return new Peasant();
            case 4:  return new Spareman();
            case 5:  return new Monk(side);
            default:   return new Xbowman();
        }
    }

    private static void getOtryad(List<Unit> units, String nameUnit){
   // ---------- Формируем отряд из сгенерированного списка (вводим имя и подсчитываем сколько у нас кого)---------
       for (Unit unit: units ) {
            if (unit.toString().split(" - ")[0].equals(nameUnit)){
                System.out.println(unit);
            }
        }

    }
}






























