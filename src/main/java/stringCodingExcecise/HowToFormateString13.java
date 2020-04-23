package stringCodingExcecise;

import java.util.*;

public class HowToFormateString13 {

	/**
	 * if we need decimal lot of value we can use double e = Math.E; java.lang.Math;
	 * String s3 = String.format("value %32.12f", 32.33434);
	 * value                  32.334340000000 
	 * upper format method after value will create 32 digit empty space then dot(.)and after dot 12 digit will print 
	 * @param args
	 */
	public static void main(String[] args) {
		double e = Math.E;
		System.out.format("%f%n", e);
		System.out.format(Locale.GERMANY, "%.4f%n%n", e);
		System.out.println("\n*************\n");
		stringFormate();
	}

	public static void stringFormate() {
		String name = "Hello World";
		String s1 = String.format("name %s", name);
		String s2 = String.format("value %f", 32.33434);
		String s3 = String.format("value %32.12f", 32.33434);
		System.out.println(s1);
		System.out.println("\n");
		System.out.println(s2);
		System.out.println("\n");
		System.out.println(s3);
		System.out.println("\n");
	}
}
