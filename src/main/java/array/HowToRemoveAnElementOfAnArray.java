package array;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
/**How To Remove An Element Of An Array after creation
 * Better to use 
 * int[] numbers =(int[])ArrayUtils.removeElement(numbers, 1);
 * @author mdislam
 *
 */
public class HowToRemoveAnElementOfAnArray {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7};
		//removing number 1
		numbers =(int[])ArrayUtils.removeElement(numbers, 1);
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]!=2) {
				System.out.print(", ");
			}
			System.out.print(numbers[i]);
		}
		System.out.println();
		
		removeAnElementFromAnArrayAfterCreation();
		
		 
	}
	
	private static void removeAnElementFromAnArrayAfterCreation() {
		int[] numbers = {1,2,3,4,5,6,7};
		
	int	number[] = Arrays.copyOf(numbers, 2);
		for (int i = 0; i < number.length; i++) {
			if (number[i]!=1) {
				System.out.print(", ");
			}
			System.out.print(number[i]);
		}

	}

}
