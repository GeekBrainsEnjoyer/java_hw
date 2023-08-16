package HW5.controller;

import java.util.ArrayList;

import HW5.model.service.DataService;
import HW5.view.UI;

public class Controller {
    private DataService service;
    private UI ui;

    public Controller(DataService service, UI ui) {
        this.service = service;
        this.ui = ui;
    }

    public void add() {
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
        } else {
            System.out.println("Incorrect input.");
        }
    }

    private ArrayList<String> createDisciplines(String s) {
        ArrayList<String> disciplines = new ArrayList<>();
        String[] temp = s.split(",");
        for (String string : temp) {
            disciplines.add(string);
        }
        return disciplines;
    }

}
