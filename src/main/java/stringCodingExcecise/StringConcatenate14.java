package stringCodingExcecise;

/** So + operator is way more faster then  StringBuffer append() method.  
 * How to optimize/performance check, string concatenation using " + " operator
 * and StringBuffer.append() method.
 * 
 * @author mdislam
 *
 */
public class StringConcatenate14 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			String result = "This is" + "testing the" + "difference" + "between" + "String" + "and" + "StringBuffer";

		}

		long endTime = System.currentTimeMillis();
		System.out.println(
				"Time taken for string concatenation using + operator : " + (endTime - startTime) + " MilliSeconds");

		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			StringBuffer result = new StringBuffer();
			result.append("This is");
			result.append("testing the ");
			result.append("difference");
			result.append("between");
			result.append("String");
			result.append("and");
			result.append("StringBuffer");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("Time taken for String concatenation using StringBuffer with append() method : "

				+ (endTime1 - startTime1) + " MilliSeconds");

		System.out.println("\nUsing concat() method for concatination*******\n");

		concateMethod();

	}

	public static void concateMethod() {
		String s = "Hellow";
		s = s.concat("World");
		System.out.println(s);
	}

}
