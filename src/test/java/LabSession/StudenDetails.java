package LabSession;

public class StudenDetails {

    // Static Variable (Class level)

    static String collegeName = "ABC College";

    // Instance Variables (Object level)

    String studentName;

    int age;

    int rollNumber;

    // Method to display student info

    public void displayStudentInfo() {

    // Local Variable (Method level)

    String course = "BMS";

    System.out.println("Student Name: " + studentName);

    System.out.println("Age: " + age);

    System.out.println("Roll Number: " + rollNumber);

    System.out.println("Course: " + course);

    System.out.println("College Name: " + collegeName);

    }

    // Main method

 public static void main(String[] args) {

    StudenDetails student = new StudenDetails();

    // Assigning instance variables

    student.studentName = "Med";

    student.age = 25;

    student.rollNumber = 11;

    student.displayStudentInfo();

    }

}
