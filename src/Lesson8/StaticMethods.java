package Lesson8;

public class StaticMethods {
    final static double pi = 3.14;

    double areaOfACircle(double radius) {
        return pi * radius * radius;
    }

    static double lengthOfACircle(double radius) {
        return 2 * pi * radius;
    }

    void infoOfACircle(double radius) {
        double area = areaOfACircle(radius);
        double length = lengthOfACircle(radius);
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area);
        System.out.println("Length = " + length);
    }

    static int multiplication(int a, int b, int c) {
        return a * b * c;
    }

    static void division(int a, int b) {
        System.out.println("Целое = " + a / b + " остаток = " + a % b);
    }
}
