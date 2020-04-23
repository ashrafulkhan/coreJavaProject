package array;

import java.util.Arrays;

public class HowToSortAndSearchElementInArray {
	/**
	 * using sort() and binarySearch() method we will print the array using a user
	 * define method printArray()
	 * 
	 * binarySearch();
	 * Linear search
	 * @param args
	 */
	public static void main(String[] args) {

		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };

		Arrays.sort(array);
		printArray("Sorted array ", array);
		
		int index = Arrays.binarySearch(array, 2);
		System.out.println("Found 2 @ " + index);
		
		
		arrayLinearSearch();

	}

	private static void printArray(String message, int array[]) {
		System.out.println(message + ": [length:" + array.length + "]");

		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}
	
	
	private static void arrayLinearSearch() {
		int a[]= {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
		int target=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]== target) {
				System.out.println("Element found at index : "+i);
				break;
			}
		}
	}
	
	
	
}
