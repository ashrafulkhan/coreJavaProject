package method;

enum Car {
	lamborghini, tata, audi, fiat, honda
}

public class HowToUseEnumAndSwitchIn {
	/**
	 * enum start with enum keyword , then name of the enum with capital latter with
	 * second bracket . And there is no coma.
	 * 
	 * How to use enum & switch statement ; This example displays how to check which
	 * enum member is selected using switch statement.
	 * 
	 * @param args
	 */

	/*
	 * enum Choice { Choice1, Choice2, Choice3 }
	 */
	public static void main(String[] args) {
		Car c;
		c = Car.tata;
		switch (c) {
		case lamborghini:
			System.out.println("You choose lamborghini!");
			break;
		case tata:
			System.out.println("You choose tata!");
			break;
		case audi:
			System.out.println("You choose audi!");
			break;
		case fiat:
			System.out.println("You choose fiat!");
			break;
		case honda:
			System.out.println("You choose honda!");
			break;
		default:
			System.out.println("You have no choose any car!");
			break;
		}
	}
}
