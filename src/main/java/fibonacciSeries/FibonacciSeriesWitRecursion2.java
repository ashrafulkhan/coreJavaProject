package fibonacciSeries;

/**
 * first fibonnaci=0; second fibonnaci=1; we don't
 * @author mdislam
 *
 */

public class FibonacciSeriesWitRecursion2 {
	static int n1=0, n2=1, n3=0,  Count = 10; 
	public static void main(String[] args) {


		System.out.print(n1+" "+n2);
		fibonacci(Count-2);
	}


	public static void fibonacci(int count) {
		if (count>0) {
			n3=n1+n2;

			n1=n2; // fist fibonnaci position we found  second fibonnaci. 
			n2=n3; // same way second fibonnaci position we get third fobonnaci, so we get n-i position n fibonnaci. 
			System.out.print("  "+n3);
			fibonacci(count-1);

		}
	}

}
