package patternPrograms;

public class Pattern25 {
	/*
	   1 
	  2 2 
	 3 3 3 
	4 4 4 4 
	 3 3 3 
	  2 2 
	   1 
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5 - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <=5 - i; j++) {
				System.out.print(" ");
			}
			for (int j =1; j <=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
