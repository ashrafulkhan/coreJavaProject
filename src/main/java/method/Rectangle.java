package method;

public class Rectangle extends Figure{

	public Rectangle(double a, double b) {
		super(a, b);
		
	}
Double area() {
	System.out.println("Inside area for rectangle. ");
	return (dim1*dim2);
}
	
}
