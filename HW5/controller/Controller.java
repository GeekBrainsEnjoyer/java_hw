package HW5.controller;

import java.util.ArrayList;

import HW5.model.data.User;
import HW5.model.service.DataService;
import HW5.view.UI;

public class Controller<T extends User> {
    private DataService<T> service;
    private UI<T> ui;

    public Controller(DataService<T> service, UI<T> ui) {
        this.service = service;
        this.ui = ui;
    }

    public void addStudent() {
        service.createStudent(
                ui.getName(),
                ui.getSurmane(),
                ui.getBirthday(),
                Integer.parseInt(ui.getGroupNum()),
                ui.getSpeciality(),
                Double.parseDouble(ui.getAvarageMark()));
    }

    public void addTeacher() {
        service.createTeacher(
                ui.getName(),
                ui.getSurmane(),
                ui.getBirthday(),
                createDisciplines(ui.getDisciplines()),
                Double.parseDouble(ui.getReating()),
                ui.getDepartament());
    }

    private ArrayList<String> createDisciplines(String s) {
        ArrayList<String> disciplines = new ArrayList<>();
        String[] temp = s.split(",");
        for (String string : temp) {
            disciplines.add(string.trim());
        }
        return disciplines;
    }

    public void infoDataBase(){
        service.infoDataBase();
    }

}