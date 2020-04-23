package array;

public class HowToExtentAnArrayAfterInitilisation {

	public static void main(String[] args) {
		String name[] = new String[] { "A", "B", "C" };
		String extended[] = new String[5];
		extended[3] = "D";
		extended[4] = "E";
		System.arraycopy(name, 0, extended, 0, name.length);
		for (int i = 0; i < extended.length; i++) {
			System.out.println(extended[i]);
		}

		System.out.println("\nWe can use below method aslo\n");
		extendedAnArrayAfterCreation();

	}

	private static void extendedAnArrayAfterCreation() {

		String names[] = new String[] { "Sai", "Ram", "Krishna" };
		String extended[] = new String[5];
		System.arraycopy(names, 0, extended, 0, names.length);
		for (int i = 0; i < extended.length; i++) {
			System.out.println(extended[i]);
		}

	}

}
