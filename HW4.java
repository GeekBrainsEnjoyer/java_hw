

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the first num: ");
        String input1 = sc.nextLine();

        System.out.println("Input the second num: ");
        String input2 = sc.nextLine();

        int num1 = 0;
        int num2 = 0;

        try {
            num1 = Integer.parseInt(input1);
            num2 = Integer.parseInt(input2);
        } catch (Exception e) {
            System.out.println("sorry");
        }

        sc.close();

        mult(creatingNums(num1), creatingNums(num2));
        sum(creatingNums(num1), creatingNums(num2));

    }

    static Deque<Integer> creatingNums(int num) {
        Deque<Integer> numDeque = new ArrayDeque<>();

        while (num != 0) {
            numDeque.addLast(num % 10);
            num /= 10;
        }

        System.out.println(numDeque);

        return numDeque;
    }

    static void mult(Deque<Integer> num1, Deque<Integer> num2) {
        LinkedList<Integer> res = new LinkedList<>();

        int zeroCount = 0;
        int temp = 0;
        int multiplier = 1;

        for (Integer item2 : num2) {
            for (Integer item1 : num1) {
                temp += item1 * item2 * multiplier;
                multiplier *= 10;
                zeroCount++;
            }
            while (zeroCount != 1) {
                multiplier /= 10;
                zeroCount--;
            }
            zeroCount = 0;
        }

        while (temp != 0) {
            res.addFirst(temp % 10);
            temp /= 10;
        }

        System.out.println(res);

    }

    static void sum(Deque<Integer> num1, Deque<Integer> num2) {
        LinkedList<Integer> res = new LinkedList<>();

        int temp = 0;
        int multiplier = 1;

        do {
            int num1Value = num1.getFirst();
            int num2Value = num2.getFirst();
            temp += (num1Value + num2Value) * multiplier;
            num1.pollFirst();
            num2.pollFirst();
            multiplier *= 10;
            if (!num1.isEmpty() && num2.isEmpty())
                num2.addFirst(0);
            if (num1.isEmpty() && !num2.isEmpty())
                num1.addFirst(0);
        } while (!num1.isEmpty() && !num2.isEmpty());

        while (temp != 0) {
            res.addFirst(temp % 10);
            temp /= 10;
        }

        System.out.println(res);
    }

}
