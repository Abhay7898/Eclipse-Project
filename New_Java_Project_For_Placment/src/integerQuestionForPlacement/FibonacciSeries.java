package integerQuestionForPlacement;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num = 8;
		int f1 = -1;
		int f2 = 1;
		int f3 = 0;
		boolean flage = false;
		for (int i = 0; i <= num; i++) {
			f3 = f1 + f2;
			if (f3 == num) {
				flage = true;
				break;
			}

			f1 = f2;
			f2 = f3;
		}
		if (flage) {
			System.out.println("fibona");
		} else {
			System.out.println("not");
		}
	}
}