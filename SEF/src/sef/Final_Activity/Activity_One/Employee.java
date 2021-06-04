package sef.Final_Activity.Activity_One;

public class Employee extends Person {

    private String jobTitle;
    private String company;
    private int salary;

    public Employee(String name, int age, String jobTitle, String company, int salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public void introducePerson() {
        System.out.printf("My name is %s and I am %d years old. I am working as %s in %s." + "\n", getName(), getAge(), getJobTitle(), getCompany());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}