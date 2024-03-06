package patternProgramForPlacement;

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
		for (int i = 0; i < 6; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			System.out.print("*");
			for (int j = 0; j < 4; j++ ) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println("");

		}
		for (int i = 0; i < 6; i++) {
			System.out.print("*");
		}
	}
}
