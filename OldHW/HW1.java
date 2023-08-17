

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        // triangularAndFactorialNumber();
        // simpleNums();
        calculator();
    }

    static void triangularAndFactorialNumber() {
        // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n!
        // (произведение чисел от 1 до n)

        Scanner sc = new Scanner(System.in);

        System.out.println("input the number: ");
        int num = sc.nextInt();
        int triangleNum = 0;
        int factorNum = 1;

        for (int i = 1; i <= num; i++) {
            triangleNum += i;
            factorNum *= i;
        }
        System.out.printf("Triangular number %d is %d, factorial of a %d is %d", num, triangleNum, num, factorNum);
        sc.close();
    }

    static void simpleNums() {
        boolean check = true;

        for (int i = 2; i < 1001; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                }
            }

            if (check == true) {
                System.out.println(i);
            }

            check = true;
        }

    }

    static void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of operation: ");
        System.out.println("1 - addition");
        System.out.println("2 - subtraction");
        System.out.println("3 - multiplication");
        System.out.println("4 - division");
        int userChoice = sc.nextInt();
        System.out.println("input the a: ");
        System.out.println("input the b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (userChoice == 1)
            addition(a, b);
        else if (userChoice == 2)
            subtraction(a, b);
        else if (userChoice == 3)
            multiplication(a, b);
        else if (userChoice == 4)
            division(a, b);

        sc.close();

    }

    static void addition(int a, int b) {
        int res = a + b;
        System.out.printf("Answer is %d", res);
    }

    static void subtraction(int a, int b) {
        int res = a - b;
        System.out.printf("Answer is %d", res);
    }

    static void multiplication(int a, int b) {
        int res = a * b;
        System.out.printf("Answer is %d", res);
    }

    static void division(int a, int b) {
        int res = a / b;
        System.out.printf("Answer is %d", res);
    }

}
