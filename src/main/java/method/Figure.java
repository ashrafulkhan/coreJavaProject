package method;

public class Figure {
	double dim1;
	double dim2;

	public Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	Double area() {
		System.out.println("Indside area of figure.");
		return (dim1 * dim2);
	}
}
