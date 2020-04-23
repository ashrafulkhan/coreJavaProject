package method;

public class MethodOverLoading {
	int height;

	public static void main(String[] args) {
     MethodOverLoading t = new MethodOverLoading(0);
     t.info();
     t.info("overLoaded method");
     new MethodOverLoading();
	}

	public MethodOverLoading() {
		// TODO Auto-generated constructor stub
		System.out.println("This is Bangladesh: ");
		height = 0;
		
	}

	public MethodOverLoading(int i) {
		System.out.println("Buliding new house that is " + i + " feet tall");
		height = i;
	}

	void info() {
		System.out.println("House is " + height + " feet tall");
		
	}
	void info(String s) {
		System.out.println(s+": House is "+height+" feet tall");
	}
}
