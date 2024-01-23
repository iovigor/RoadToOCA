package Lesson5;

public class WorkWithEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Petrov", 32, 1000, "it");
        e1.increaseSalaryTwice();
        System.out.println(e1.salary);
    }
}
