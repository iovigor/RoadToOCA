package Lesson7;

import Lesson5.Employee;

public class WorkWithEmployee {

    public static void main(String[] args) {
        Lesson7.Employee e1 = new Lesson7.Employee(1, "Petrov", 32, "it");
        e1.increaseSalaryTwice();
        System.out.println(e1.getSalary());
    }

}
