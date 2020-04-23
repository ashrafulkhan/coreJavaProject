package array;

public class MergeTwoIntArray {
	/**
	 * How to union/merge two array in java?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int b[] = { 90, 80, 70, 60, 50, 40, 30, 20, 10 };
		int c[] = new int[a.length + b.length];

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
			count = count++;
		}
		for (int j = 0; j < b.length; j++) {
			c[count++] = b[j];
		}

		for (int i = 0; i < b.length; i++) {
			if (b[i] != 90) {
             System.out.print(", ");
			}
			System.out.print(c[i]);

		}
		System.out.print("\nMerging two array is possible: ");
	}

}
