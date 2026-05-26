package Assignments_21_05_2026;

public class FindSquare {

	int Side1;
	int Side2;

	// Method
    public void Square() {

    	System.out.println("Square: " + Side1*Side2);
    }

    // Main method to test
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
    	FindSquare s= new FindSquare();
        s.Side1=10;
        s.Side2=20;
        s.Square();

    }

}