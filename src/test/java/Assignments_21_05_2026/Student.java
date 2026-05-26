package Assignments_21_05_2026;

public class Student {

	String name;

    int age;

    int rollNumber;

    // Method to display student details

    public void displayStudentDetails() {

        System.out.println("Name " + name);

        System.out.println("Age " + age);

        System.out.println("Roll Number " + rollNumber);
    }

    // Main method to test

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Student s1 = new Student();
        s1.name ="Med";
        s1.age = 20;
        s1.rollNumber = 10;

        s1.displayStudentDetails();

    }

}