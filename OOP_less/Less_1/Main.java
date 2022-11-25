package OOP_less.Less_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    // ---------- наполняю массив случайными персонажами ------------
    public static void main(String[] args) {
        List<Unit> units = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            units.add(rand_get_unit());
        }

//        units.forEach(unit -> System.out.println(unit.toString()));
        getOtryad(units, "Снайвпер");
    }

    private static Unit rand_get_unit() {
        // ---------- Генерируем случайный выбор ПЕРСОНАЖА из 7 вариантови ------------
        int num = new Random().nextInt(7);
        switch (num) {
            case 0:  return new Peasant();
            case 1:  return new Monk();
            case 2:  return new Robber();
            case 3:  return new Sniper();
            case 4:  return new Spareman();
            case 5:  return new Wizard();
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






























