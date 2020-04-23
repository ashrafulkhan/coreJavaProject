package com.shiftedtech.coreJavaProject;

public class ArrayClass {
	/**
	 * inside array data member or instance
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;
		double sum = 0;
		int[] arrayInt = new int[6];
		arrayInt[0] = 23;
		arrayInt[1] = 55;
		arrayInt[2] = 88;
		arrayInt[3] = 15;
		arrayInt[4] = 50;
		arrayInt[5] = 20;
		for (i = 0; i < arrayInt.length; i++) {
			System.out.println("Tenght of the array is : " + arrayInt[i]);
			sum = sum + arrayInt[i];
			System.out.println(sum);
			System.out.println("Average of an array is : "+sum/2);
		}
	}

}
