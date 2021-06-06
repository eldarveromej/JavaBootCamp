package sef.Final_Activity.Activity_One;

import java.util.*;

public class FirstActivity {
    public static void main(String[] args) {


        Employee dobro = new Employee("Eldar", "Veromej", 24, "QA", "Accenture", 7000);
        Employee belka = new Employee("Elizabeth", "Windsor", 18, "Face", "Tiktok", 4000);
        Employee kakai = new Employee("Akaki", "Paki", 44, "Mayor", "Rosgosstrakh", 5000);
        Employee tomsk = new Employee("Dobrynya", "Nikitich",21, "QA", "Scandiweb", 5000);
        Employee april = new Employee("Mirella","Pampella", 23, "QA", "Accenture", 3500);
        Employee melon = new Employee("Timur","Parkur", 36, "QA", "Decta", 6000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(dobro);
        employeeList.add(belka);
        employeeList.add(kakai);
        employeeList.add(tomsk);
        employeeList.add(april);
        employeeList.add(melon);

        employeeList.forEach(Employee::setintroducePerson);

        employeeList.sort(Comparator.comparingInt(Employee::getSalary).reversed());

        for(Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

