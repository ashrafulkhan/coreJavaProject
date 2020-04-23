package array;

public class BubbleSortArrayElement {

	public static void main(String[] args) {
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		System.out.println("Array Before bubble sort : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\nAfter assign now we will call bubble sort:\n");
		
		bubbleSortArrayElement(array);
		
		System.out.println("\nAfter bubble sort again assign and we will print:\n");
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
		}
	}

	private static void bubbleSortArrayElement(int[] array) {
		int n = array.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - 1); j++) {

				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[i];
					array[i] = temp;
				}
			}
		}
	}
}
