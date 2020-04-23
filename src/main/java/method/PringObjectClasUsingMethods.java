package method;

import java.util.ArrayList;
import java.util.Vector;

/**
 * How to display Object class using instanceOf keyword? This example makes
 * displayObjectClass() method to display the class of the Object that is passed
 * in this method as an argument
 * 
 * @author mdislam
 *
 */

public class PringObjectClasUsingMethods {

	public static void main(String[] args) {

		Object testObject = new ArrayList();
		displayObjectClass(testObject);
	}

	public static void displayObjectClass(Object o) {
		if (o instanceof Vector) {
			System.out.println("\nObject was an instance of the class  java.util.Vectore\n");
		} else if (o instanceof ArrayList) {
			System.out.println("\nObject was an instance of the class: java.util.ArrayList");
		} else {
			System.out.println("Object was an instance of the : " + o.getClass());
		}
	}

}
