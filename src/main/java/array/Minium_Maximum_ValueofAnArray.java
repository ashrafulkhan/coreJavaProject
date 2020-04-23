package array;

public class Minium_Maximum_ValueofAnArray {
/** Swap is the easiest way to find maximum and minimum value of an array element.
 * How to find Maximum and Minimum value of an array in Java?
 * @param args
 */
	public static void main(String[] args) {
		int inputArray[] = { 8, 3, 5, 10, 20, 40, 50, 70, 100 };
		System.out.println(minValue(inputArray));
		System.out.println(maxValue(inputArray));
	}

	private static int minValue(int[] inputArray) {
		int minimulValue = inputArray[0];

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] < minimulValue) {
				minimulValue = inputArray[i];

			}
		}

		return minimulValue;
	}

	private static int maxValue(int[] inputArray) {
		int maximulValue = inputArray[0];

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] > maximulValue) {
				maximulValue = inputArray[i];

			}
		}

		return maximulValue;
	}

}
