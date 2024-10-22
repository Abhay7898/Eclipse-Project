package stringQuestionForPlacement;

public class AnagramProgram {
	public static void main(String[] args) {
		String one = "Dormitory";
		String two = "DirotyRom";
		
		boolean flage = false;
		
		char oneArr[] = one.replaceAll("\\s", "").toLowerCase().toCharArray();
		char twoArr[] = two.replaceAll("\\s", "").toLowerCase().toCharArray();
		
		if (oneArr.length == twoArr.length) {
			for (int i = 0; i < oneArr.length; i++) {
				flage = false;
				for (int j = 0; j < twoArr.length; j++) {
					if (oneArr[i] == twoArr[j]) {
						twoArr[j] = '*';
						flage = true;
						break;
					}
				}
				if (!flage) {
					break;
				}
			}
		}
		if (flage == true) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}
}
