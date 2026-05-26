package Assignments_22_05_2026;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 7;

        boolean isPrime = true;

        // Check if number is <= 1

        if (number <= 1) {

            isPrime = false;

        } 
        
        else
        
        {

    // Loop from 2 to number-1

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {

                    isPrime = false;

                    break;

                }

            }

        }

        // Print result

        if (isPrime) {

            System.out.println(number + " is a Prime Number");

        } else {

            System.out.println(number + " is NOT a Prime Number");

        }

    }

}