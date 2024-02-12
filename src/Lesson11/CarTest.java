package Lesson11;

public class CarTest {

    public static void changeNumberOfDoors(Car car, int numberOfDoors){
        car.numberOfDoors = numberOfDoors;
    }

    public static void changeColors(Car car1, Car car2){
        String color3 = car1.color;
        car1.color = car2.color;
        car2.color = color3;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Black", "V8", 2);
        Car car2 = new Car("White", "V8", 4);
        changeColors(car1, car2);
        changeNumberOfDoors(car1, 3);
        System.out.println("car1.color = "+car1.color);
        System.out.println("car2.color = "+car2.color);
        System.out.println("car1.numberOfDoors = "+car1.numberOfDoors);
    }

}
