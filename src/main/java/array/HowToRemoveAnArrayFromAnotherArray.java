package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowToRemoveAnArrayFromAnotherArray {

	
		public static void main(String[] args) {
			List<Integer> numbersA = new ArrayList<>();
			List<Integer> numbersB = new ArrayList<>();
			numbersA.addAll(Arrays.asList(new Integer[] { 1, 3, 4, 7, 5, 2 }));
			numbersB.addAll(Arrays.asList(new Integer[] { 13, 32, 533, 3, 4, 2 }));
			System.out.println("A: " + numbersA);
			System.out.println("B: " + numbersB);

			numbersB.removeAll(numbersA);
			System.out.println("B cleared: " + numbersB);
			
			
			System.out.println("/nRemove an String array from Another String Array: \n");
			removeAnArrayFromAnotherArray();
			
			}

		
		
		private static void removeAnArrayFromAnotherArray() {
			ArrayList<String> objArrayList=new ArrayList<>();
			ArrayList<String> objArrayList2=new ArrayList<>();
			
			objArrayList2.add(0, "common1");
			objArrayList2.add(1, "common2");
			objArrayList2.add(2, "notcommon");
			objArrayList2.add(3, "notcommon1");
			
			objArrayList.add(0, "common1");
			objArrayList.add(1, "common2");
			objArrayList.add(2, "notCommon2");
			objArrayList.add(3, "notcommon1");
			
			
			System.out.println("Arrays of elements of array1: "+objArrayList);
			System.out.println("Arrays of elements of array2: "+objArrayList2);
			objArrayList.removeAll(objArrayList2);
			
			System.out.println("Arrays1 after removing arrays2 from arrays1 : "+objArrayList);
		}
		
	}


