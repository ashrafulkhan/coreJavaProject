package method;

public class FibonacciSerieseUsingMethod {

	public static void main(String[] args) {

		int count = 15;
		int feb[] = new int[count];
		feb[0] = 0;
		feb[1] = 1;
		for (int i = 2; i < count; i++) {
			feb[i] = feb[i - 1] + feb[i - 2];
		}

		for (int i = 0; i < count; i++) {
			System.out.println(feb[i]);
		}

	}

}
