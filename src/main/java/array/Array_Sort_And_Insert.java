package array;

import java.util.Arrays;

public class Array_Sort_And_Insert {

	/**
	 * https://www.geeksforgeeks.org/array-copy-in-java/
	 * https://www.journaldev.com/753/java-copy-array-array-copy-java
	 * 
	 * different coping array methods: clone() and System.arrayCoppy() How to sort
	 * an array and insert an element inside it?
	 * 
	 * To accomplish the task.for sorting arrayElement we will use ---> sort()
	 * method To inserting element in to the array we will use a user defined method
	 * ---> insertElement() To print arrayElement we will use user defined method
	 * ----> printArray()
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(array);
		printArray("Sorted array", array);
		int index = Arrays.binarySearch(array, 1);
		System.out.println("Didn't find 1 @" + index);

		int newindex = -index - 1;
		array = insertElement(array, 1, newindex);
		printArray("With 1 added ", array);

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

	private static int[] insertElement(int original[], int element, int index) {
		int length = original.length;
		int destination[] = new int[length + 1];
		System.arraycopy(original, 0, destination, 0, index);
		destination[index] = element;
		System.arraycopy(original, index, destination, index + 1, length - index);
		return destination;
	}

}
