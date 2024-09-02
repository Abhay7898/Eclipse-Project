package patternPrograms;

public class Pttern28 {
	/*
   * * * * * * *
	 * * * * *
	   * * *
	     *
	   * * *
	 * * * * * 
   * * * * * * *
	 */
	public static void main(String[] args) {
		for (int i = 7; i >=1; i--) {
			for (int j =i; j >=1; j--) {
				System.out.print("*"+" ");
			}
			if (i==1) {
				break;
			}
			System.out.println();
			i--;
			for (int j =7-i+1; j >=1; j--) {
				System.out.print(" ");
			}
		}	
		System.out.println();
		for (int i = 2; i <=7; i++) {
			for (int j = 7-i-1; j >=1; j--) {
				System.out.print(" ");
			}
			i++;
			for (int j =1; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
