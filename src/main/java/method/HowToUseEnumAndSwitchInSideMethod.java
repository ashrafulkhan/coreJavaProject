package method;

public class HowToUseEnumAndSwitchInSideMethod {
	/**
	 * How to use enum & switch statement ; This example displays how to check which
	 * enum member is selected using switch statement.
	 * 
	 * @param args
	 */

	enum Choice {
		Choice1, Choice2, Choice3
	}

	public static void main(String[] args) {
		Choice ch = Choice.Choice1;
		switch (ch) {
		case Choice1:
			System.out.println("Choose1 selected");
			break;
		case Choice2:
			System.out.println("Choose2 selected");
			break;
		case Choice3:
			System.out.println("Choose3 selected ");
			break;

		default:
			System.out.println("You don't have any choose!");
			break;
		}
	}
}
