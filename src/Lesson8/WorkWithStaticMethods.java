package Lesson8;

public class WorkWithStaticMethods {
    public static void main(String[] args) {
        int res = StaticMethods.multiplication(1, 2, 3);
        System.out.println("Result of multiplication = "+res);
        StaticMethods.division(2, 1);
        StaticMethods stMethods = new StaticMethods();
        double area = stMethods.areaOfACircle(5);
        System.out.println("area = "+area);
        double length = StaticMethods.lengthOfACircle(5);
        System.out.println("Length = "+length);
        stMethods.infoOfACircle(5);
    }
}
