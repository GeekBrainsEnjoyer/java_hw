package HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
        randomNambers(4, 10);
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
        for(Integer num: nums)
            sum += num;
        System.out.println("Avarage value = " + sum / nums.size());
    }
}
