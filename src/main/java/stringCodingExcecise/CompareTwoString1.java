package stringCodingExcecise;

public class CompareTwoString1 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		equalsMethod();
		System.out.println("\n");
		doubleEqualOperators();
		
	}
	
	public static void equalsMethod() {
		String s1= "TutorialsPoints";
		String s2="TutorialsPoints";
		String s3=new String("Tutorials Points");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
	}
	
	public static void doubleEqualOperators() {
		String s1= "TutorialsPoints";
		String s2="TutorialsPoints";
		String s3=new String("Tutorials Points");
		System.out.println(s1==s2);
		System.out.println(s2==s3);
	}
	
}
