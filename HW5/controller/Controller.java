package HW5.controller;

import java.util.ArrayList;

import HW5.model.data.User;
import HW5.model.service.UserService;
import HW5.view.UI;

public class Controller<T extends User> {
    private UserService<T> service;
    private UI<T> ui;

    public Controller(UserService<T> service, UI<T> ui) {
        this.service = service;
        this.ui = ui;
    }

    public void add() {
        try {

            if (Integer.parseInt(ui.getUserType()) == 1) {
                service.createStudent(
                        ui.getName(),
                        ui.getSurmane(),
                        ui.getBirthday(),
                        Integer.parseInt(ui.getGroupNum()),
                        ui.getSpeciality(),
                        Double.parseDouble(ui.getAvarageMark()));

            } else if (Integer.parseInt(ui.getUserType()) == 2) {
                service.createTeacher(
                        ui.getName(),
                        ui.getSurmane(),
                        ui.getBirthday(),
                        createDisciplines(ui.getDisciplines()),
                        Double.parseDouble(ui.getReating()),
                        ui.getDepartament());
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    private ArrayList<String> createDisciplines(String s) {
        ArrayList<String> disciplines = new ArrayList<>();
        String[] temp = s.split(",");
        for (String string : temp) {
            disciplines.add(string.trim());
        }
        return disciplines;
    }

}
