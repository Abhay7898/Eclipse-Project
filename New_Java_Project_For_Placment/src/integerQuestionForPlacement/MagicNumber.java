package integerQuestionForPlacement;

public class MagicNumber {
	public static void main(String[] args) {
		int number=235;
		int chek=0;
		while (number!=0) {
			int one=number%10;
			number=number/10;
			chek+=one;
		}
		if(chek==10) {
			System.out.println("Megic Number");
		}else {
			System.out.println("Not a Megic Numaber");
		}
	}
}
