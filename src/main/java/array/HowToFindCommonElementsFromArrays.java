package array;

import java.util.ArrayList;

public class HowToFindCommonElementsFromArrays {
      /** How to find common element from two array?
       *  How to union two array element so that common element found. 
       *  use --->   Obj.retainAll(Obj2)  method. 
       * @param args
       */
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<>();
		ArrayList<String> obj2 = new ArrayList<>();
		obj2.add(0, "common1");
		obj2.add(1, "common2");
		obj2.add(2, "notcommon");
		obj2.add(3, "notcommon1");

		obj.add(0, "common1");
		obj.add(1, "common2");
		obj.add(2, "notcommon2");
		obj.add(3, "notcommon3");

		System.out.println("ArrayElement of array1: "+obj);
		System.out.println("ArrayElement of array2: "+obj2);

		obj.retainAll(obj2);
		System.out.println("Obj after retaining common elements of obj2 and obj: "+obj);


		System.out.println("\nFor Int Array we can use below method using 2 for loop: \n");
		commonElementOfTwoIntArray();
	}

	private static void commonElementOfTwoIntArray() {
		int arr1[] = {4,7,3,9,2};
		int arr2[] = {3,2,12,9,40,32,4};

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}

	}

}
