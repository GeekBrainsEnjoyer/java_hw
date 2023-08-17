package HW5.model.service;

import java.util.ArrayList;

import HW5.model.data.User;

public interface DataService<T extends User> {
        boolean createTeacher(String name, String surname, String birthday, ArrayList<String> discipline,
                        double reating,
                        String departament);

        boolean createStudent(String name, String surname, String birthday, int groupNum, String speciality,
                        double avarageMark);

       void infoDataBase();
}
