package patternProgramForPlacement;

public class PremitNumber {
	
//	    1 
//	   2 2 
//	  3 3 3 
//	 4 4 4 4 
//	5 5 5 5 5 
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 6; i++) {
			for (int j = 6 - i; j>1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i;k++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}
}
