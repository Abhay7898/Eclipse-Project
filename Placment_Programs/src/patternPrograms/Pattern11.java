package patternPrograms;

public class Pattern11 {
	/*
	1234567
	 234567
	  34567
	   4567
	    567
	     67
	      7
	     67
	    567
	   4567
	  34567
	 234567
	1234567
	*/
	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = i; j <= 7; j++) {
				System.out.print(j);
			}
			System.out.println();
			if (i != 7) {
				for (int j = 1; j <= i; j++) {
					System.out.print(" ");
				}
			}
		}
		for (int i = 6; i>=1; i--) {
			for (int j =i-1; j >=1;j--) {
				System.out.print(" ");
			}
			for (int j = i; j <=7; j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}

	}
}
