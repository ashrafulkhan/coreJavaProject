package method;

public class HowToUseBreakToJumpOutOfA_LoopIn_A_Method {

	public static void main(String[] args) {

		int[] intary = { 99, 12, 22, 34, 45, 67, 56, 78 };

		int no = 78;
		int i = 0;
        boolean found=false;
        for (; i < intary.length; i++) {
			if (intary[i]==no) {
				found=true;
				break;
			}
        }
			if (found) {
				System.out.println("Found the no: "+no+" at index "+i);
			}
			else {
				System.out.println(no+"not found in the array");
			}
		}
	}


