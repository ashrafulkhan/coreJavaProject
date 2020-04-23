package array;

import java.util.Arrays;

public class HowToFill_initialize_AtOnceAnArray {
	/**
	 * How to fill ( initialize at once ) an array at one short.
	 * Array.fill(arrayname,value) method and Array.fill(arrayname,starting
	 * index,ending index,value) method of java.Util class.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = new int[6];

		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
		System.out.println("\nWe don't initilize array yet but we are fring to print "
				+ "\nvalue from 0 to 6 index so it will return all index value is : 0"
				+ "\nBelow java.Utils.class method help us to initilize array element at one shot easyly:\n ");

		Arrays.fill(array, 10);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("\nWe can use this method also, " + "\nThis method tels from which index to which index "
				+ "\nI want to initilize at one shot.\n ");
		Arrays.fill(array, 0, 6, 50);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
