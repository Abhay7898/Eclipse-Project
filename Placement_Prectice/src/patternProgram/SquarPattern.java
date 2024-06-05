package patternProgram;

public class SquarPattern {
  //	******
	//	*    *
	//	*    *
	//	*    *
	//	*    *
	//	*    *
	//	*    *
	//	******
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=1;i<=6;i++) {
			System.out.print("*");
			for(int j=1;j<=4;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for (int i = 1; i <=6; i++) {
			System.out.print("*");
		}
	}
}
