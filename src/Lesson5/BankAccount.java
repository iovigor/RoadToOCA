package Lesson5;

public class BankAccount {
    int id;
    double balance;

    void popolnenieScheta(double plus){
        balance += plus;
    }
    void snyatieSoScheta(double minus){
        balance -= minus;
    }
}
