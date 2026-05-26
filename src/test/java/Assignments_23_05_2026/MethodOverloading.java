package Assignments_23_05_2026;

public class MethodOverloading {

// Method with 2 integers

public void add(int a, int b) {

    int sum = a + b;

    System.out.println("Sum of 2 numbers: " + sum);

}
// Method with 3 integers

public void add(int a, int b, int c) {

    int sum = a + b + c;

    System.out.println("Sum of 3 numbers: " + sum);

}

// Main method

public static void main(String[] args) {

	MethodOverloading obj = new MethodOverloading();

    obj.add(10, 20);       // calls 2-parameter method

    obj.add(5, 10, 15);    // calls 3-parameter method

}

}