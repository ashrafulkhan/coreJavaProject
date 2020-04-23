package com.shiftedtech.coreJavaProject;

public class MaxValueFromArray {

	public static void main(String[] args) {
		int[] array = new int[] { 10, 20, 30, 40, 50, 60, 70 };

	}

	// method for getting for maximum value from a array
	public static int getMaxValue(int[] inputArray) {
		int maxValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}

//method for getting for minimum value from a array
	public static int getMinValue(int[] inputArray) {
		int minValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (minValue < inputArray[i]) {
				minValue = inputArray[i];
			}
		}
		return minValue;

	}

}
