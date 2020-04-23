package method;

public class MethodOverLoading2 {
	public static void main(String[] args) {
		MethodOverLoading2 cal = new MethodOverLoading2();
		cal.sum(20, 30);
		cal.sum(20, 30, 40);
	}

	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}
