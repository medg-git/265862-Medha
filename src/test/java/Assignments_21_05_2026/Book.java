
package Assignments_21_05_2026;


	public class Book {
		String tittle;
		String author;
		double price;
	
    public void displayBook(){
    	
    	System.out.println("Tittle is " + tittle);
    	System.out.println("Author is " + author);
    	System.out.println("Price is " + price);
  
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b= new Book();
		b.tittle = "Java";
		b.author = "James";
		b.price = 499.0;
		
		b.displayBook();
		
		
	}
	
} 
		 
		 
		 
		 