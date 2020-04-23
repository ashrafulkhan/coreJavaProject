package array;

import java.util.Arrays;
/**How to check two array are equal or not?
 * How to compare two array ? 
 * use Arrays.equals() method
 * @author mdislam
 *
 */
public class HowToCheckTwoArrayEqualOrNot {
	/** How to check 2 array are equal or not?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int ary[] = {1,2,3,4,5,6};
		int ary1[] = {1,2,3,4,5,6};
		int ary2[] = {1,2,3,4};

		System.out.println("Is ary1 equal to array2 : "+Arrays.equals(ary, ary1));
		System.out.println("Is ary1 equal to array2 : "+Arrays.equals(ary, ary2));


		System.out.println("\nWe can use below method which is so essey : \n");
		checkTwoArrayAreEqual();
	}


	private static void checkTwoArrayAreEqual() {
		int ary1[] = {1,2,3,4,5,6};
		int ary2[] = {1,2,3,4};
		if (Arrays.equals(ary1, ary2)) {
			System.out.println("Both aray1 and ary2 are equal: ");
		}else {
			System.out.println("Both array are not equal: ");
		}
	}

}
