package method;

public class UseOfLabel_insideMethod {
	/**
	 * How to use method overloading for printing different types of array? This
	 * example shows how to jump to a particular label when break or continue
	 * statements occur in a loop
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String strSearch = "This is the string in which you have to search for a substring. ";
		String subString = "substring";

		boolean found = false;
		int max = (strSearch.length()) - (subString.length());

		testlabel: for (int i = 0; i <= max; i++) {
			int length = subString.length();
			int j = i;
			int k = 0;

			while (length-- != 0) {

				if (strSearch.charAt(j++) != subString.charAt(k++)) {
					continue testlabel;
				}
			}
			found = true;
			break;

		}

		if (found) {
			System.out.println("Found the subString : ");
		} else {
			System.out.println("Did not found the subString in the string. ");
		}
	}

}
