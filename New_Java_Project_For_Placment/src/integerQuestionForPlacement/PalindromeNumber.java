package integerQuestionForPlacement;

public class PalindromeNumber {
	public static void main(String[] args) {
		int number = 121;
		int n = number;
		int pen = 0;
		while (number > 0) {
			int num = number % 10;
			pen = (pen*10)+num;
			number = number / 10;
		}
		if(n==pen) {
			System.out.println(n+" is a PalindromeNumber");
		}else {
			System.out.println(n+" is Not a PalindromeNumber");
		}
	}
}
