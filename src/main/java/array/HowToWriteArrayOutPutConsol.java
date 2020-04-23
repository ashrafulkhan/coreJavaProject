package array;

import java.util.Arrays;

public class HowToWriteArrayOutPutConsol {
/**How to write Array output console in java?
 * 
 * @param args
 */
	public static void main(String[] args) {
		String greeting[]=new String[3];
		greeting[0]="This is the greeting";
		greeting[1]="for all readers from";
		greeting[2]="Java source . ";
		
		for (int i = 0; i < greeting.length; i++) {
			System.out.println(greeting[i]);
		}
		
		outputConsole();

	}
	
	private static void outputConsole() {
		String array[]=new String[] {"Bangladesh ","Is","beutiful country"};
		System.out.println(Arrays.toString(array));
	}

}
