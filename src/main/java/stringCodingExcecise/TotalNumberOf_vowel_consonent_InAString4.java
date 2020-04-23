package stringCodingExcecise;

public class TotalNumberOf_vowel_consonent_InAString4 {
	public static void main(String[] args) {
		int vowel = 0, consonent = 0;

		String string = "Kustia is stands on the bank of the Gari";
		string = string.toLowerCase();

		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o'
					|| string.charAt(i) == 'u') {
				vowel = vowel + 1;
			} else if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
				consonent++;
			}
		}
		System.out.println("Number of vowel : " + vowel);
		System.out.println("Number of consonent : " + consonent);

	}
}
