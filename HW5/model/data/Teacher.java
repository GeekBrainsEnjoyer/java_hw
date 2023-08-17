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
        Teacher.idTeacher = idTeacher++;
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

    public static int getIdTeacher() {
        return idTeacher;
    }

    public static void setIdTeacher(int idTeacher) {
        Teacher.idTeacher = idTeacher;
    }

    public void setDisciplines(ArrayList<String> disciplines) {
        this.disciplines = disciplines;
    }

    @Override
    public String toString() {
        return "Teacher [" + super.toString() + "disciplines=" + disciplines + ", reating=" + reating + ", departament="
                + departament + "]";
    }

}
