package integerProgram;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number=153;
		int check=number;
		int num=0;
		while (number!=0) {
			int one=number%10;
			num+=one*one*one;
			number=number/10;
		}
		if (check==num) {
			System.out.println("yes Armstrong Number!!");
		}else {
			System.out.println("Not Armstrong Number!!");
		}
	}
}
