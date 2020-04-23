package stringCodingExcecise;
/**
 * indexOf() return positive value if found subString/character inside String. if not found return -1. 
 * contains() method return true; if the subString/character found inside String. 
 * @author mdislam
 *
 */


public class HowToCharchAWordInSideAString8 {
	public static void main(String[] args) {
		String string = "Hellow Readers";
		int indexOfString = string.indexOf("Readers");
		if (indexOfString == -1) {
			System.out.println("Readers not found");
		} else {
			System.out.println("Readers found at index:  " + indexOfString);
		}
		
		System.out.println("\n");

	}
	public static void hellowWorld() {
		String textString="The cat is on the table";
		System.out.println(textString.concat("cat"));
				
	}
}
