package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.collect.ObjectArrays;
/** Joining two array in to a array 
 * String [] joined = ObjectArrays.concat(d, e, String.class);
 * System.out.println("Joined array : " + Arrays.toString(joined));
 * @author mdislam
 *
 */
public class MergeTwoStringArray {

	public static void main(String[] args) {
		String a[] = { "A", "B", "C" };
		String b[] = { "D", "E", "F" };
		List<String> list = new ArrayList<String>(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		String c = list.toString();
		System.out.println(c);
		
		
		System.out.println("\nTwo String Array Mearging in to a String Array : ");
		stringArrayMerge();
	}
	
	private static void stringArrayMerge() {
		String d[]= {"A", "B", "C"};
		String e[]= { "D", "E", "F"};
		String [] joined = ObjectArrays.concat(d, e, String.class);
        System.out.println("Joined array : " + Arrays.toString(joined));
      


	}

}
