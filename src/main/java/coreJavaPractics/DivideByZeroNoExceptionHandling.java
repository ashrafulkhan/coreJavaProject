package coreJavaPractics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true;
		
	do {
		try {
			
			System.out.println("please enter an integer number ");
			int numerator =	scanner.nextInt();
			System.out.println("please enter a integer denomirator ");
			int denomirator =	scanner.nextInt();
			int result =	quotient(numerator, denomirator);
			System.out.printf("\nResult: %d / %d = %d\n",numerator,denomirator,result );
			continueLoop =false;
		} catch (InputMismatchException  inputMismatchException) {
			System.err.printf("\nException: %s\n", inputMismatchException);
			scanner.nextLine();
			System.out.println("You must enter integer, please try again.\n");
			
		}catch (ArithmeticException arithmeticException) {
			System.out.printf("\nException: %s\n", arithmeticException);
			System.out.println("You must enter integer, please try again.\n");
		}
	} while (continueLoop);	
		
	}

	public static int quotient(int numerator, int denominator) throws ArithmeticException {
		return	numerator / denominator;
	}


}
