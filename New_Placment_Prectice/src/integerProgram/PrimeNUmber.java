package integerProgram;

public class PrimeNUmber {
	public static void main(String[] args) {
		int num=25;
		for (int i = 2; i <num/2; i++) {
			if (num%2==0) {
				System.out.println("Not Prime Number");
			}
		}
	}
}
