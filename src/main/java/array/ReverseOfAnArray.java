package array;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOfAnArray {
	/**
	 * How to Reverse of an arrayList in java?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add("F");
		arrayList.add("G");
		arrayList.add("H");
		arrayList.add("I");

		System.out.println("Before Reverse Order: " + arrayList);
		Collections.reverse(arrayList);
		System.out.println("After Reverse Order: " + arrayList);
		System.out.println("*******************");
		
		arrayElement();
		
	}

	private static void arrayElement() {
		int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Array Before Reverse: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println("\n*******************");
		int n = numbers.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

				if (numbers[j - 1] < numbers[j]) {
					// swap the elements!
					temp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = temp;
				}

			}
		}

		System.out.println("\nAfter Reverse : ");

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

	}

}
