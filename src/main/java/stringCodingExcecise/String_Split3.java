package stringCodingExcecise;

public class String_Split3 {
	/**
	 * String split is easy using regular expration (-) and split() method .
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		String s1 = "t u t o r i l s";

		String[] wordStrings = s1.split("\\s");
		for (String string : wordStrings) {
			System.out.print("\n" + string);
		}

		System.out.println(
				"\nHere we put some space and replace with (-) as a cherecter regex. if we donot put space it will not splite in this case \n");
		String s2 = "t u t o r i a l s";
		// String ob = "-";
		String[] splitStrings = s2.split("-");
		for (int f = 0; f < splitStrings.length; f++) {
			System.out.println(splitStrings[f]);

		}

		System.out.println("\n**************\n");
		String string = "jan-feb-march";

		String[] temp = string.split("-");
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

		System.out.println("\n**************\n");
		String dotString = "jan.feb.march";

		String[] dotStrings = dotString.split("\\.");
		for (int p = 0; p < dotStrings.length; p++) {
			System.out.println(dotStrings[p]);
		}

		System.out.println("\n***************\n");

		String string2 = "amar sonar bangla";
		String delemeterString = "-";
		String[] tem2 = string2.split(delemeterString, 3);
		for (int j = 0; j < tem2.length; j++) {
			System.out.println(tem2[j]);
		}
	}

}
