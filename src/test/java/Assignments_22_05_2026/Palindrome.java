package Assignments_22_05_2026;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = 121;

	        int originalNumber = number;

	        int reverse = 0;

	        // Reverse the number

	        while (number > 0) {

	            int digit = number % 10;

	            reverse = reverse * 10 + digit;

	            number = number / 10;

	        }

	        // Check Palindrome

	        if (originalNumber == reverse) {

	            System.out.println(originalNumber + " is a Palindrome Number");

	        } else {

	            System.out.println(originalNumber + " is NOT a Palindrome Number");

	        }

	    }

	}

	 