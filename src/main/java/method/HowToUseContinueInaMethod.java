package method;
/**
 * How to use continue in a method. 
 * @author mdislam
 *
 */
public class HowToUseContinueInaMethod {

	public static void main(String[] args) {
		StringBuffer searchBuffer = new StringBuffer("Hellow how are you. ");
		int lenght = searchBuffer.length();
		int count = 0;
		for (int i = 0; i < lenght; i++) {
			if (searchBuffer.charAt(i) != 'H')
				continue;
			count++;
			searchBuffer.setCharAt(i, 'H');
		}
		System.out.println(" Found " + count + " H 's int the string.");
		System.out.println(searchBuffer);
		
		
		System.out.println("\nUse of continue method in java: \n");
		useOfcontineMethod();
		
	}
	
	
	

	private static void useOfcontineMethod() {
		for (int i = 1; i <=10; i++) {
			if (i ==5) {
				continue;
				//break;
			}
			System.out.println(i);
		}
	}

}
