package Lesson6;

public class WorkWithOverload {

    public static void main(String[] args) {
        Overload over = new Overload();
        over.sum();
        over.sum(1);
        over.sum(1, 2);
        over.sum(1, 2, 3);
        over.sum(1, 2, 3, 4);
    }
}
