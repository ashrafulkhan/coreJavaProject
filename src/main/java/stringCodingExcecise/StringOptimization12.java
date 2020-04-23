package stringCodingExcecise;

public class StringOptimization12 {
	/**
	 * String object creation performance check using string literals and with 'new' key words.
	 * 
	 * Creation time of String literals : 1 Milliseconds Creation time of String
	 * object with 'new' key word : 3 MilliSeconds Creation time of String objects
	 * with intern() method : 6 MilliSecond
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] variableString = new String[50000];
		for (int i = 0; i < 50000; i++) {
			variableString[i] = "s" + i;

		}
		long startTime0 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			variableString[i] = "hello";
		}
		long endTime0 = System.currentTimeMillis();
		System.out.println("Creation time" + " of String literals : " + (endTime0 - startTime0) + " Miliseconds");

		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			variableString[i] = new String("hello");
		}

		long endTime1 = System.currentTimeMillis();
		System.out.println("Creation time of " + " String object with 'new' key word : " + (endTime1 - startTime1)
				+ " MilliSeconds");

		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			variableString[i] = new String("hello");
			variableString[i] = variableString[i].intern();
		}

		long endTime2 = System.currentTimeMillis();
		System.out.println("Creation time of " + " String objects with intern() method : " + (endTime2 - startTime2)
				+ " MilliSecond");
	}

}
