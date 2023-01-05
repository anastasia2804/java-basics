package package1;

public class Car {

    String make;
    String model;
    int year;
    double price;

    Car (String carMake, String carModel, int year, double price) {
        this.make = carMake;
        this.model = carModel;
        this.year = year;
        this.price = price;
    }

    void drive() {
        System.out.println("You're driving");
    }

    void brake() {
        System.out.println("You're about to stop");
    }
}
