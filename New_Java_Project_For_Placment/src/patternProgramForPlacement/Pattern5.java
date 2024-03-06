package patternProgramForPlacement;

public class Pattern5 {
	/*
	7 6 5 4 3 2 1
	7 6 5 4 3 2
	7 6 5 4 3
	7 6 5 4
	7 6 5
	7 6
	7
	*/
	public static void main(String[] args) {
		for(int i =7;i>1;i++) {
			for (int j=7;j<=1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
