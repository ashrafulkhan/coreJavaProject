package method;

public class FindAreaUsingMethodInheritence {
	/**
	 * How to use method overriding in inheritance for subclasses . This example
	 * demonstrates the way of method overriding by subclasses with different number
	 * and type of parameters.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Figure f = new Figure(10, 20);
		Rectangle r = new Rectangle(9, 5);

		Figure figuref;
		figuref = f;
		System.out.println("Area is : " + figuref.area());

		figuref = r;
		System.out.println("Area is : " + figuref.area());

	}

}
