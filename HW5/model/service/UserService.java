package HW5.model.service;

import java.util.ArrayList;

import HW5.model.data.DataBase;
import HW5.model.data.Student;
import HW5.model.data.Teacher;
import HW5.model.data.User;

public class UserService<T extends User> implements DataService<T> {

    private static final DataBase db = new DataBase();

    @Override
    public boolean createTeacher(String name, String surname, String birthday, ArrayList<String> discipline,
            double reating, String departament) {
        boolean flag = db.add(new Teacher(name, surname, birthday, discipline, reating, departament));
        return flag;

    }

    @Override
    public boolean createStudent(String name, String surname, String birthday, int groupNum, String speciality,
            double avarageMark) {
        boolean flag = db.add(new Student(name, surname, birthday, groupNum, speciality, avarageMark));
        return flag;

    }

    public boolean add(User user) {
        boolean flag = db.add(user);
        return flag;

    }

    public void infoDataBase() {
        ArrayList<User> users = db.getDb();
        for (User user : users) {
            System.out.println(user.toString() + "\n");
        }
    }

}
