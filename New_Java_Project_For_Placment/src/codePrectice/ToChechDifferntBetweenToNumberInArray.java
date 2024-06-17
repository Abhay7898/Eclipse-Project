package codePrectice;

public class ToChechDifferntBetweenToNumberInArray {
	public static void main(String[] args) {
		int array[] = { 3, 6, 9, 12, 15 };
		int diff = array[0];
		boolean flage = false;
		int number = diff;
		for (int i = 1; i < array.length; i++) {
			flage = false;
			if (array[i] - diff == number) {
				diff = array[i];
				flage = true;
			}
		}
		if (flage) {
			System.out.println("Arithmetic");
		} else {
			System.out.println("Geometric");
		}
	}
}
