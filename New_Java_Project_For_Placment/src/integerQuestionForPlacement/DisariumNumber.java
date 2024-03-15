package integerQuestionForPlacement;

public class DisariumNumber {
	// 135=1+3*3+5*5*5
	// =1+9+125
	public static void main(String[] args) {
		int number = 135;
		int n=number;
		int num = 0;
		int len = String.valueOf(number).length();
		while (len!=0) {
			int check=1;
			int one = number % 10;
			number = number / 10;
			for(int i=len;i!=0;i--) {
				check *= one;
			}
			num += check;
			len--;
		}
		if(num==n) {
			System.out.println(num+" "+"is a Disarium Number");
		}else {
			System.out.println(num+" "+"is Not a Disarium Number");
		}
		
	}
}
