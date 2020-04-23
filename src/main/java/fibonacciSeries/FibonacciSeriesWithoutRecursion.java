package fibonacciSeries;

public class FibonacciSeriesWithoutRecursion {

	public static void main(String[] args) {
	
	
		int first=0,second=1, fibo, count=10;
		
		System.out.print(first+" "+second);//  printing first two number o and 1
		
		for (int i = 3; i < count; ++i) {
			fibo=first+second;
			System.out.print(" "+fibo);
			
			first=second;
			
			
			second=fibo;
			
			
		}
		

	}

}
