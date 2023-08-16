package HW5.model.data;

import java.util.ArrayList;

public class Teacher extends User {
    static int idTeacher = 1;
    private ArrayList<String> disciplines;
    private double reating;
    private String departament;

    public Teacher(String name, String surname, String birthday, ArrayList<String> discipline, double reating,
            String departament) {
        super(name, surname, birthday);
        this.idTeacher = idTeacher++;
        this.disciplines = discipline;
        this.reating = reating;
        this.departament = departament;
    }

    public ArrayList<String> getDisciplines() {
        return disciplines;
    }

    public void setDiscipline(ArrayList<String> discipline) {
        this.disciplines = discipline;
    }

    public double getReating() {
        return reating;
    }

    public void setReating(double reating) {
        this.reating = reating;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nSurname: %s\nDepartment: %d\nDesciplins: %s\nReating: %d\n", this.getName(),
                this.getSurname(),
                this.departament, this.disciplines, this.reating);
    }

}
