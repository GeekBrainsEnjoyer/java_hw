package HW5.Program;

import java.util.Scanner;

import HW5.controller.Controller;
import HW5.model.data.User;
import HW5.model.service.UserService;
import HW5.view.UI;

public class App {
    public static void buttonClick() {
        Controller<User> controller = new Controller<>(new UserService<>(), new UI<>());
        boolean continuation = true;
        try (Scanner sc = new Scanner(System.in)) {

            do {
                System.out.println(
                        "If you want:\n- add Student click 1\n- add Teacher click 2\n- for database info click 3.\n- close the app click 4.");
                String key = sc.nextLine();
                switch (key) {
                    case "1":
                        controller.addStudent();
                        break;
                    case "2":
                        controller.addTeacher();
                        break;
                    case "3":
                        controller.infoDataBase();
                        break;
                    case "4":
                        continuation = false;
                        break;

                    default:
                        System.out.println("Incorrect input.");
                        break;
                }
            } while (continuation);
        }
    }
}
