package Lesson7;

public class Employee {
    int id;
    public String surName;
    int age;
    private double salary;
    String department;

    private Employee(int id, String surName, int age, double salary, String department) {
        this.id = id;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    Employee(int id, String surName, int age, String department) {
        this(id, surName, age, 0, department);
    }
    public Employee(int id, String surName, int age) {
        this(id, surName, age, 0, "");
    }

    void increaseSalaryTwice() {
        salary *= 2;
    }

    public int getId() {
        System.out.println(id);
        return id;
    }

    public String getSurName() {
        System.out.println(surName);
        return surName;
    }

    public double getSalary() {
        System.out.println(salary);
        return salary;
    }
}
