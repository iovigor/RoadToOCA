package Lesson3;

public class ArithmeticAndLogic {
    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println(result);
        int a = 5;
        int res1 = a-- - --a + ++a + a++ + a;
        System.out.println(res1);
        int b = 8;
        int res2 = ++b - b++ + ++b - --b;
        System.out.println(res2);
    }
}
