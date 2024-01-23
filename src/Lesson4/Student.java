package Lesson4;

public class Student {
    int id;
    String name;
    String surName;
    int course;
    double averageGradeMath;
    double averageGradeEconomy;
    double averageGradeForeignLanguage;

    Student() {
        this(0, "", "", 0, 0, 0, 0);
    }
    Student(int id, String name, String surName, int course) {
        this(id, name, surName, course, 0, 0, 0);
    }

    Student(int id, String name, String surName, int course,
            double averageGradeMath, double averageGradeEconomy, double averageGradeForeignLanguage) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.course = course;
        this.averageGradeMath = averageGradeMath;
        this.averageGradeEconomy = averageGradeEconomy;
        this.averageGradeForeignLanguage = averageGradeForeignLanguage;
    }
}
