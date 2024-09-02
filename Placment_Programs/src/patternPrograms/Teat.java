package patternPrograms;

public class Teat {
	/*	
	  1 
     2 2 
    3 3 3 
   4 4 4 4 
  5 5 5 5 5 
 6 6 6 6 6 6  
*/
	public static void main(String[] args) {
		for (int i = 6; i >=1; i--) {
			for (int j =i-1; j >=1; j--) {
				System.out.print(" ");
			}
			for (int j = i; j <=6; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
