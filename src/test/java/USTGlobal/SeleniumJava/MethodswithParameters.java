package USTGlobal.SeleniumJava;

	public class MethodswithParameters {
	   
	// methods with parameters
	
	
	public void add (int a,int b ){
		

	int c = a + b;
	
	
	System.out.println("Addition is " + c);

    
    }

	public static void main(String[] args) {
		
	
	MethodswithParameters m = new MethodswithParameters();
	

     m.add(20, 30);            

    }

}
