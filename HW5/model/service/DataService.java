package HW5.model.service;

import java.util.ArrayList;
import java.util.List;

import HW5.model.data.Student;
import HW5.model.data.Teacher;
import HW5.model.data.User;

public interface DataService<T extends User> {
    Teacher createTeacher(String name, String surname, String birthday, ArrayList<String> discipline, double reating,
            String departament);

    Student createStudent(String name, String surname, String birthday, int groupNum, String speciality,
            double avarageMark);

    List<T> readData();
}
