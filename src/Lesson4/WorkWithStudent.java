package Lesson4;

public class WorkWithStudent {
    public static void main(String[] args) {

        Student stud1 = new Student();
        double averageGrade1 = averageGrade(stud1);
        System.out.println(averageGrade1);

        Student stud2 = new Student(2, "Petr", "Petrov", 1);
        double averageGrade2 = averageGrade(stud2);
        System.out.println(averageGrade2);

        Student stud3 = new Student(3, "Sidor", "Sidorov", 1, 95, 85, 88);
        double averageGrade3 = averageGrade(stud3);
        System.out.println(averageGrade3);
    }

    static double averageGrade(Student stud) {
        return (stud.averageGradeMath + stud.averageGradeEconomy + stud.averageGradeForeignLanguage) / 3;
    }
}
