
package Assignments_21_05_2026;

public class Car {

    String brand;

    String model;

    double price;

    // Constructor

    public Car(String brand, String model, double price) {

        this.brand = brand;

        this.model = model;

        this.price = price;

    }

    // Methods

    public void startCar() {

        System.out.println(brand + " " + model + " has started.");

    }

    public void stopCar() {

        System.out.println(brand + " " + model + " has stopped.");

    }

    // Main method to test

    public static void main(String[] args) {
		// TODO Auto-generated method stub

        Car car1 = new Car("Car One", "Model One", 2000000);

        car1.startCar();

        car1.stopCar();

    }

}