package array;

import java.util.ArrayList;

public class HowToFindObjectOrStringInAnArray {
/**How to find Object or String from an array
 * use contains() method its return true if found. 
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
		
		System.out.println("array of obj contains of String common1 ????  "+obj.contains("common1"));
		System.out.println("array of obj2 contains of String common2 ????  "+obj2.contains("common"));


	}

}
