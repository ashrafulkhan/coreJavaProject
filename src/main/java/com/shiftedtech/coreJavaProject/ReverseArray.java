package com.shiftedtech.coreJavaProject;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arrayInt= {3,4,5,6,7,8,9};		
         
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.println("Value of array is : "+arrayInt[i]);
			
		}
		
		System.out.println();
		
		for(int i=arrayInt.length-1; i>=0; i--) {
			System.out.println("The reverse array is : "+arrayInt[i]);
		}

	}

}
