package integerQuestionForPlacement;

public class CountUptoNumberIsAddedUntilSingleDigit {
	public static void main(String[] args) {
		int number = 1234558383;
		boolean flage = true;
		int newNumber = 0;
		int count = 0;
		while (flage) {
			int num = number % 10;
			number = number / 10;
			newNumber += num;
			if (number == 0) {
				number=newNumber;
				newNumber=0;
				count++;
				if (number > 0 && number < 10) {
					flage = false;
					System.out.println(count);
				}
			}
		}
	}
}
