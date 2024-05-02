package Lesson12;

import Lesson4.Student;

public class StudentTest {

    public static void compareStudents(Student st1, Student st2){
        if (st1.name.equals(st2.name) && st1.surName.equals(st2.surName) && st1.course == st2.course) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    public static void compareStudentsDetailed(Student st1, Student st2){
        if (!st1.name.equals(st2.name)) {
            System.out.println("name is not equal");
        } else if (!st1.surName.equals(st2.surName)) {
            System.out.println("surName is not equal");
        } else if (st1.course != st2.course) {
            System.out.println("course is not equal");
        }
        else {
            System.out.println("equal");
        }
    }
    public static void main(String[] args) {

        Student st1 = new Student(2, "Petr", "Petrov", 1);
        Student st2 = new Student(3, "Petr", "Petrov", 2);
        compareStudents(st1, st2);
        compareStudentsDetailed(st1, st2);

    }

}