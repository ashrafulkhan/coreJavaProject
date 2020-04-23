package array;

import java.util.Arrays;

public class NestedArray {

	public static void main(String[] args) {
		String deepArray[][] = new String[][] { { "Sai", "Gopal" }, { "Pallavi", "Priya" } };
		// String arr= Arrays.toString(deepArray);
		String string = Arrays.asList(deepArray).toString();

		System.out.println(string);

		System.out.println(Arrays.deepToString(deepArray));

	}

}
