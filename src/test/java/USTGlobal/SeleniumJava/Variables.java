package USTGlobal.SeleniumJava;

public class Variables {
	
	  // instance variables
    String employeeBU = "HR";
    
    // local variables  scope is within the method
public void employeedetails() {

   // local variables

   String employeeName = "Ravi";

   int employeeId = 1234;

   System.out.println(employeeName);
   
   System.out.println(employeeId);
   
   System.out.println(employeeBU);
  
    }

    // static variables scope is within the class and object

    //but we can access with out creating the object


public static void main(String[] args) {
     
   Variables v = new Variables();
     
   v.employeedetails();                  
     
   System.out.println(v.employeeBU);

    }


}