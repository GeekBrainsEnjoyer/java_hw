package HW5.model.service;

import java.util.ArrayList;
import java.util.List;

import HW5.model.data.DataBase;
import HW5.model.data.Student;
import HW5.model.data.Teacher;
import HW5.model.data.User;

public class UserService<T extends User> implements DataService<T> {

    private DataBase base;

    public UserService() {
        base = new DataBase();
    }

    @Override
    public List<T> readData() {
        return null;
    }

    @Override
    public Teacher createTeacher(String name, String surname, String birthday, ArrayList<String> discipline,
            double reating, String departament) {
        return new Teacher(name, surname, birthday, discipline, reating, departament);

    }

    @Override
    public Student createStudent(String name, String surname, String birthday, int groupNum, String speciality,
            double avarageMark) {
        return new Student(name, surname, birthday, groupNum, speciality, avarageMark);

    }

}
