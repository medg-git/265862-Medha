package Assignments_22_05_2026;

public class CountDigitInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     int number = 12345;

	     int count = 0;

	        // Loop to count digits

	        while (number != 0) {

	            number = number / 10;

	            count++;

	        }

	        System.out.println("Number of digits is: " + count);

	    }

	}