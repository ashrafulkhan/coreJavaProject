package stringCodingExcecise;

public class LastIndexOfAString2 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	
		lastIndexOfAString();
		
}
	
	public static void lastIndexOfAString() {
		 String strOrig = "Hello world ,Hello Reader";
	      int lastIndex = strOrig.lastIndexOf("Hello");
	      
	      if(lastIndex == - 1){
	         System.out.println("Hello not found");
	      } else {
	         System.out.println("Last occurrence of Hello is at index "+ lastIndex);
	      }
	}
}
