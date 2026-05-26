package Assignments_23_05_2026;

public class RectangleGetSet {

// Private instance variables

	   private int length;

	   private int width;

	    // Setter method for length

	    public void setLength(int length) {

	        this.length = length;

	    }

    // Getter method for length

	    public int getLength() {

	        return length;

	    }

	    // Setter method for width

	    public void setWidth(int width) {

	        this.width = width;

	    }

	 
    // Getter method for width

	    public int getWidth() {

	        return width;

	    }

	    // Main method to test the class

	    public static void main(String[] args) {

	 
	    	RectangleGetSet rect = new RectangleGetSet();

	     // Set values using setters

	        rect.setLength(10);

	        rect.setWidth(5);

	        // Get values using getters

	        System.out.println("Length: " + rect.getLength());

	        System.out.println("Width: " + rect.getWidth());

	    }

	}



