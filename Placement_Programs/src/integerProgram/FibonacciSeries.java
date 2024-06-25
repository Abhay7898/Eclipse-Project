package integerProgram;

public class FibonacciSeries {
	public static void main(String[] args) {
		int f1=-1;
		int f2=1;
		int f3=0;
		int num=19;
		while (f3<=num) {
			f3=f2+f1;
			System.out.println(f3);
			if (f3==num) {
				break;
			}
			f1=f2;
			f2=f3;
		}

	}
}
