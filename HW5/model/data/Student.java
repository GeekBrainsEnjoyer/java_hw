package HW5.model.data;

public class Student extends User {
    static int idStudent = 1;
    private int groupNum;
    private String speciality;
    private double avarageMark;

    public Student(String name, String surname, String birthday, int groupNum, String speciality,
            double avarageMark) {
        super(name, surname, birthday);
        Student.idStudent = idStudent++;
        this.groupNum = groupNum;
        this.speciality = speciality;
        this.avarageMark = avarageMark;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getAvarageMark() {
        return avarageMark;
    }

    public void setAvarageMark(double avarageMark) {
        this.avarageMark = avarageMark;
    }

    public static int getIdStudent() {
        return idStudent;
    }

    public static void setIdStudent(int idStudent) {
        Student.idStudent = idStudent;
    }

    @Override
    public String toString() {
        return "Student [" + super.toString() + "groupNum=" + groupNum + ", speciality=" + speciality + ", avarageMark="
                + avarageMark + "]";
    }

}
