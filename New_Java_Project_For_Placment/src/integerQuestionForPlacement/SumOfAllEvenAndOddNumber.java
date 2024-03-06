package integerQuestionForPlacement;

public class SumOfAllEvenAndOddNumber {
	public static void main(String[] args) {
		int num=100;
		int countEven=0;
		int countOdd=0;
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				countEven+=i;
			}else {
				countOdd+=i;
			}
		}
		System.out.println(countEven);
		System.out.println(countOdd);
	}
}
