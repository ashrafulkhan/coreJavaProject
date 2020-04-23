package array;

import java.util.Arrays;

public class HowToCompareTwoArray {
	/**
	 * To compare two Array we can compare both array[] reference or we can use
	 * import java.util.Arrays; and Arrays class have equals() method which compare
	 * both arrays content.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, };
		int arr2[] = { 1, 2, 3 };
		if (arr1 == arr2) {
			System.out.println("Both arr1 and arr2 are same: ");

		} else {
			System.out.println("Both arr1 and arr2 are not same: ");
		}

		System.out.println("\nWe can use below method to compare two array: \n ");

		twoArrayCompare();

	}

	private static void twoArrayCompare() {
		int arr3[] = { 1, 2, 3, };
		int arr4[] = { 1, 2, 3 };
		if (Arrays.equals(arr3, arr4)) {
			System.out.println("Both arr1 and arr2 are same: ");
		} else {
			System.out.println("Both arr1 and arr2 are not same: ");
		}
	}

}
