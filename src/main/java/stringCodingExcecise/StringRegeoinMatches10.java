package stringCodingExcecise;

public class StringRegeoinMatches10 {
	/**
	 * 11 is the index number in the source string from where comparison starts
	 * Second_str is the destination string 12 is the index number from where
	 * comparison should start in destination string 9 is the number of characters
	 * to compare
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String first_str = "Welcome to Microsoft";
		String second_str = "I work with Microsoft";
		boolean match = first_str.regionMatches(11, second_str, 12, 9);
		System.out.print("first_str index[11 - 19]== second_str index[12 - 21] are match :"+match);

	}

}
