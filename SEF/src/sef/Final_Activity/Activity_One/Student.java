package sef.Final_Activity.Activity_One;

public class Student extends Person {

    private String schoolName;

    public Student(String name, String surname, int age) {
        super(name, surname,  age);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String introducePerson() {
        return String.format("I study in university %d", schoolName);
    }
}
