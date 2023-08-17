package HW5.view;

import java.util.Scanner;

import HW5.model.data.User;

public class UI<T extends User> {
    Scanner sc;

    public UI() {
        sc = new Scanner(System.in);
    }

    public String getUserType() {
        System.out.println("Who do you want to add:\n1 - Student.\n2 - Teacher.");
        return sc.nextLine();
    }

    public String getName() {
        System.out.println("Name: ");
        return sc.nextLine();
    }

    public String getSurmane() {
        System.out.println("Surname: ");
        return sc.nextLine();
    }

    public String getBirthday() {
        System.out.println("Birthday: ");
        return sc.nextLine();
    }

    public String getSpeciality() {
        System.out.println("Speciality: ");
        return sc.nextLine();
    }

    public String getGroupNum() {
        System.out.println("Group: ");
        return sc.nextLine();
    }

    public String getAvarageMark() {
        System.out.println("Avarage mark: ");
        return sc.nextLine();
    }

    public String getDisciplines() {
        System.out.println("Disciplines(separate with commas): ");
        return sc.nextLine();
    }

    public String getReating() {
        System.out.println("Reating: ");
        return sc.nextLine();
    }

    public String getDepartament() {
        System.out.println("Departament: ");
        return sc.nextLine();
    }


}
