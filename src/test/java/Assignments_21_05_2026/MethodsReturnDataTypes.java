package Assignments_21_05_2026;

public class MethodsReturnDataTypes {


    public int getIntValue() {

        return 10;

    }

    public double getDoubleValue() {

        return 20.5;

    }

    public String getStringValue() {

        return "Hello Med";

    }

    public boolean getBooleanValue() {

        return true;

    }

    // Main method to test

    public static void main(String[] args) {
    	// TODO Auto-generated method stub

        MethodsReturnDataTypes obj = new MethodsReturnDataTypes();

         System.out.println("Int: " + obj.getIntValue());

        System.out.println("Double: " + obj.getDoubleValue());

        System.out.println("String: " + obj.getStringValue());

        System.out.println("Boolean: " + obj.getBooleanValue());

    }

}
