package patternPrograms;

public class Pattern18 {
	/**
	 * 0000000
	 * 0100000
	 * 0020000
	 * 0003000
	 * 0000400
	 * 0000050
	 * 0000006
	 */
	public static void main(String[] args) {
		for (int i = 0; i <=6; i++) {
			for (int j =1; j <=6; j++) {
				if (i==j) {
					System.out.print(j);
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
			
		}
	}
}
