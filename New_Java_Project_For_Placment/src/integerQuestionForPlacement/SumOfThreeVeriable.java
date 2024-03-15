package integerQuestionForPlacement;

public class SumOfThreeVeriable {
	public static void main(String[] args) {
		int array[] = { 5, -9, 4, -2, 7, 1, -4, -3, -7 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int j2 = j + 1; j2 < array.length; j2++) {
					if (array[i] + array[j] + array[j2] == -7) {
						System.out.println(array[i] + "," + array[j] + "," + array[j2]);
					}
					if (array[i] + array[j] == -7) {
						System.out.println(array[i] + "," + array[j]);
					}
				}
			}
		}
	}
}
