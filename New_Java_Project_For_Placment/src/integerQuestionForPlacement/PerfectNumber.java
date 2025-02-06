package integerQuestionForPlacement;

public class PerfectNumber {
	public static void main(String[] args) {
		int perfect=8128;
		int total = 0;
		for(int i=1;i<=perfect/2;i++) {
			if(perfect % i == 0) {
				total += i;
			}
		}
		System.out.println(total);
		System.out.println(total/2);
	}
}
