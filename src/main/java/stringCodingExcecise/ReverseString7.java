package stringCodingExcecise;

public class ReverseString7 {
	public static void main(String[] args) {

		String string = "abcdefghijklmnopqrstuvwxyz";
		char[] value = string.toCharArray();
		for (int i = value.length - 1; i >= 0; i--) {
			System.out.print(value[i]);
		}
		
		System.out.println("\nUsing StringBuffer Class Reverse function:");
		reverseArray();
	}

	public static void reverseArray() {
		String string = "abcdefghijklmnopqrstuvwxyz";

		String string2 = new StringBuffer(string).reverse().toString();
		System.out.print("\nString before reverse : " + string);
		System.out.print("\nString after reverse: " + string2);
	}
}
