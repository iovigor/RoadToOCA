package Lesson6;

public class Overload {

    void sum(){
        System.out.println("Result = 0");
    }
    void sum(int a1){
        System.out.println("Result = "+a1);
    }
    void sum(int a1, int a2){
        System.out.println("Result = "+(a1 + a2));
    }
    void sum(int a1, int a2, int a3){
        System.out.println("Result = "+(a1 + a2 + a3));
    }
    void sum(int a1, int a2, int a3, int a4){
        System.out.println("Result = "+(a1 + a2 + a3 + a4));
    }
}
