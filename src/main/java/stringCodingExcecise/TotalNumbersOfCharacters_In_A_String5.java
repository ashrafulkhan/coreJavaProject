package stringCodingExcecise;



public class TotalNumbersOfCharacters_In_A_String5 {


	/**
	 * 
	 * @author mdislam
	 *
	 */
	public static void main(String[] args) {

		String string="The best of both worlds Bangladesh is one of the small country where lot of poputation";
		int	count=0;

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i)!=' '){
				count=count+1;
			}
		}
		System.out.println(count);

	}





}
