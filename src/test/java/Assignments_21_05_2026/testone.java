package Assignments_21_05_2026;

public class testone {

    // =========================

    // 1. Student Details

    // =========================

    String name;

    int age;

    int rollNumber;

  public void displayStudentDetails() {

	  	System.out.println("Student Name: " + name);

        System.out.println("Age: " + age);

        System.out.println("Roll Number: " + rollNumber);

    }

    // =========================

    // 2. Car Details

    // =========================

    String brand;

    String model;

    double price;

 public void startCar() {

        System.out.println(brand + " " + model + " has started.");

    }


public void stopCar() {

        System.out.println(brand + " " + model + " has stopped.");

    }

    // =========================

    // 3. Square Method

    // =========================

    public static int findSquare(int number) {

        return number * number;

    }

    // =========================

    // 4. Return Types Methods

    // =========================

    public int getIntValue() {

        return 100;

    }

    public double getDoubleValue() {

        return 55.5;

    }

    public String getStringValue() {

        return "Automation Learning";

    }

    public boolean getBooleanValue() {

        return true;

    }

    // =========================

    // 5. Book Details

    // =========================

    String title;

    String author;

    double bookPrice;

    public void displayBook() {

        System.out.println("Title: " + title);

        System.out.println("Author: " + author);

        System.out.println("Price: " + bookPrice);

    }

    // =========================

    // Main Method (Testing All)

    // =========================

    public static void main(String[] args) {

        testone obj = new testone();

        // Student

        obj.name = "StudentA";

        obj.age = 25;

        obj.rollNumber = 101;

        obj.displayStudentDetails();

        System.out.println("Student details is");

        // Car

        obj.brand = "BrandA";

        obj.model = "ModelA";

        obj.price = 1500000;

        obj.startCar();

        obj.stopCar();

        System.out.println("Car Details");

        // Square

        int square = findSquare(6);

        System.out.println("Square: " + square);

        System.out.println("Squares");

        // Return types

        System.out.println("Int: " + obj.getIntValue());

        System.out.println("Double: " + obj.getDoubleValue());

        System.out.println("String: " + obj.getStringValue());

        System.out.println("Boolean: " + obj.getBooleanValue());

        System.out.println("Return Types");

        // Book

        obj.title = "Tittle A";

        obj.author = "Author A";

        obj.bookPrice = 499;

        obj.displayBook();

    }

}


