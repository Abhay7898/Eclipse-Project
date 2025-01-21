package patternPrograms;

public class Pattern24 {
	/**
	   * 
	  * * 
	 * * * 
	* * * * 
	 * * * 
	  * * 
	   * 
	 */
	public static void main(String[] args) {
		for (int i =1; i <=4; i++) {
			for (int j =4; j>i; j--) {
				System.out.print(" ");
			}
			for (int j =1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 0; i < args.length; i++) {
			
		}
		for (int i =1; i <=3; i++) {
			for (int j =1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int j =3; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
