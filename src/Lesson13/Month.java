package Lesson13;

public class Month {

    public static void numberOfDays(int month){

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 2:
                System.out.println("27");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("incorrect month");

        }

    }

}

class MonthTest {

    public static void main(String[] args) {

        Month.numberOfDays(1);
        Month.numberOfDays(2);
        Month.numberOfDays(4);
        Month.numberOfDays(13);

    }

}

