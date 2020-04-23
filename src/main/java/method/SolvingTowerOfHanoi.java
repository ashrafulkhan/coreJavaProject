package method;

public class SolvingTowerOfHanoi {

	public static void main(String[] args) {
		int nDisks=3;
		dotowers(nDisks, 'A', 'B', 'C');


		System.out.println("\nWe can see how method works as a java developer: ");
		move(5, 1, 3);

	}

	public static void dotowers(int topN, char from,char inter,char to) {
		if (topN==1) {
			System.out.println("Dist 1 from "+from+" to "+to);
		}else {
			dotowers(topN-1, from, to, inter);
			System.out.println("Disk "+topN+" from "+from+" to "+to);
			dotowers(topN-1, inter, from, to);
		}
	}


	public static void move(int n, int startPole, int endPole) {
		if (n==0) {
			return;
		}
		int intermediatePole = 6 - startPole - endPole;
		move(n-1, startPole, intermediatePole);
		System.out.println("Move "+n+" from "+startPole+" to "+endPole);
		move(n-1, intermediatePole, endPole);
	}

}
