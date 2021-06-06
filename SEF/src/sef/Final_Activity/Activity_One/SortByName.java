package sef.Final_Activity.Activity_One;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class SortByName {
    public static void main(String[] args) {

        // Sort by name and surname

        Employee employee1 = new Employee("Eldar", "Veromej", 24);
        Employee employee2 = new Employee("Pamella", "Rought", 31);
        Employee employee3 = new Employee("Michael", "Jackson", 57);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        employeeList.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getSurname));
        for (Employee employee:
                employeeList) {
            System.out.println(employee);
        }
    }
}
