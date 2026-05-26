package Assignments_22_05_2026;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int number = 5;
	        int factorial = 1;

	        // Loop to calculate factorial

	        for (int i = 1; i <= number; i++) {

	            factorial = factorial * i;

	        }

	        System.out.println("Factorial of " + number + " is: " + factorial);
	}
}
