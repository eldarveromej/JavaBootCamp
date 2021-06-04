package sef.Final_Activity.Activity_One;

import java.util.*;
import java.util.stream.Collectors;

public class FirstActivity {
    public static void main(String[] args) {


        Employee dobro = new Employee("Eldar", 24, "QA", "Accenture", 7000);
        Employee belka = new Employee("Elizabeth", 18, "Face", "Tiktok", 4000);
        Employee kakai = new Employee("Akaki", 44, "QA", "Rosgosstrakh", 5000);
        Employee tomsk = new Employee("Dobrynya", 21, "QA", "Scandiweb", 5000);
        Employee april = new Employee("Mirella", 23, "QA", "Accenture", 3500);
        Employee melon = new Employee("Timur", 36, "QA", "Decta", 6000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(dobro);
        employeeList.add(belka);
        employeeList.add(kakai);
        employeeList.add(tomsk);
        employeeList.add(april);
        employeeList.add(melon);

        employeeList.sort(Comparator.comparingInt(Employee::getSalary).reversed());

        for(Employee employee : employeeList) {
            System.out.println(employee);
        }

        employeeList.forEach(Employee::introducePerson);
    }
}

