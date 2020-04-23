package method;

public class ClaculateFactorialOfANumber {

	public static void main(String[] args) {
		for (int counter = 1; counter <= 10; counter++) {
			System.out.printf("%d! =%d\n", counter, factorialOfAnumber(counter));
		}

		System.out.println("\nBelow method is so helpful to find the factorial number of any number: \n");
		factorialNumber();
	}

	public static long factorialOfAnumber(long number) {
		if (number <= 1) {
			return 1;
		} else {
			return number * factorialOfAnumber(number - 1);
		}
	}

	public static void factorialNumber() {
		int number = 5;
		int factorial = number;
		for (int i = (number - 1); i > 1; i--) {
			factorial = factorial * i;
			//System.out.println(factorial);
		}
		System.out.println("Factorial of 5 is : "+factorial);
	}

}
