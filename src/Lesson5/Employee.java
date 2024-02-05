package Lesson5;

public class Employee {
    int id;
    String surName;
    int age;
    double salary;
    String department;

    Employee(int id, String surName, int age, double salary, String department) {
        this.id = id;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    void increaseSalaryTwice() {
        salary *= 2;
    }
}
