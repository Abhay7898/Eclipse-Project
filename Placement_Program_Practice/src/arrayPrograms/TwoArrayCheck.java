package arrayPrograms;

public class TwoArrayCheck {
	public static void main(String[] args) {
		int[] one = { 1,2,3,2,1 };
		int[] two = { 1,2,3,4,5 };
		boolean flage = false;
		
		if (one.length == two.length) {
			for (int i = 0; i < one.length; i++) {
				flage=false;
				for (int j = 0; j < two.length; j++) {
					if (one[i]==two[j]) {
						flage=true;
						break;
					}
				}
				if (!flage) {
					break;
				}
			}
		}
		
		if (flage) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
