package arrayPrograms;

public class TwoArrayCheck {
	public static void main(String[] args) {
		int[] arrayOne = { 2, 5, 1, 0, 4};
		int[] arrayTwo = { 2,0, 1, 3, 4};
		boolean flage=false;
		if (arrayOne.length==arrayTwo.length) {
			for (int i = 0; i < arrayOne.length; i++) {
				flage=false;
				for (int j = 0; j < arrayTwo.length; j++) {
					if (arrayOne[i]==arrayTwo[j]) {
						flage=true;
						break;
					}
				}
			}
		}
		if (flage) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}
	}
}
