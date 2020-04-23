package coreJavaPractics;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int a = 1; 
        int b = 0; 
          
        try
        { 
             computeDivision(a,b); 
          
        } 
          
        // matching ArithmeticException 
        catch(ArithmeticException ex) 
        { 
            // getMessage will print description of exception(here / by zero) 
            System.out.println(ex.getMessage()); 
        } 
	}
	
	
	static int dividedByZero(int a, int b) {
		int i = a/b;
		return i;
		
	}
	
	static int computeDivision(int a, int b) {
		int result = 0;
		try {
			result= dividedByZero(a, b);
		} catch (NumberFormatException ex) {
			System.out.println("Numberformate exception is occured ");
		}
		return result;
	}
	
	

}
