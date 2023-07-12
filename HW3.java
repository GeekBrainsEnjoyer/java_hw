package HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class HW3 {
    public static void main(String[] args) {
        // randomNambers(4, 10);
        planetsCounter(10);
    }

    // Задание 1

    // 1.Пусть дан произвольный список целых чисел.

    // 1) Нужно удалить из него чётные числа
    // 2) Найти минимальное значение
    // 3) Найти максимальное значение
    // 4) Найти среднее значение

    static void randomNambers(int size, int maxvalue) {
        ArrayList<Integer> nums = new ArrayList<>(size);
        Random rnd = new Random();

        for (int i = 0; i < size; i++) {
            nums.add(rnd.nextInt(maxvalue));
        }

        for (Integer num : nums)
            System.out.print(num + " ");
        System.out.println();

        nums.removeIf(n -> n % 2 == 0);

        Iterator<Integer> iter = nums.iterator();

        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        System.out.println("Max value = " + Collections.max(nums));
        System.out.println("Min value = " + Collections.min(nums));

        int sum = 0;
        for (Integer num : nums)
            sum += num;
        System.out.println("Avarage value = " + sum / nums.size());
    }

    // Задание 2

    // Для списка из задачи про Солнечную систему удалить все повторяющиеся
    // элементы.

    static void planetsCounter(int n) {
        List<String> listPlanets = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus",
                "Neptune");
        List<String> randPlanets = new ArrayList<String>(n);
        // int[] counts = new int[listPlanets.size()];
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            randPlanets.add(listPlanets.get(rnd.nextInt(listPlanets.size())));
            System.out.print(randPlanets.get(i) + " ");
            // counts[listPlanets.indexOf(randPlanets.get(i))]++;
        }
        System.out.println();

        // for (int i = 0; i < counts.length; i++) {
        // System.out.printf("%s - %s\n", listPlanets.get(i), counts[i]);
        // }

        Set<String> uniquePlanets = new HashSet<>(randPlanets);
        randPlanets.clear();
        randPlanets.addAll(uniquePlanets);

        for (String planet : randPlanets)
            System.out.print(planet + " ");
    }
}
