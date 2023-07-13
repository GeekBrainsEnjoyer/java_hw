package HW;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        numBook();
    }

    static void numBook() {
        Scanner sc = new Scanner(System.in);

        Map<String, LinkedList<Long>> numBook = new HashMap<>();

        String name = "";
        long phoneNum = 0;
        String userChoice = "y";

        do {
            System.out.println("Input the name: ");
            name = sc.nextLine().toLowerCase().trim();

            System.out.println("Input the phone number: ");
            String input = sc.nextLine();

            try {
                phoneNum = Long.parseLong(input);
            } catch (Exception e) {
                System.out.println("It is not a phone number.");
                System.out.println(numBook);
                sc.close();
                return;
            }

            if (numBook.containsKey(name))
                numBook.get(name).add(phoneNum);
            else {
                numBook.put(name, new LinkedList<>());
                numBook.get(name).add(phoneNum);
            }

            System.out.println("Do you want to continue?(Y/N)");
            userChoice = sc.nextLine();

        } while (userChoice.equals("y"));

        sc.close();

        System.out.println(numBook);

    }
}
