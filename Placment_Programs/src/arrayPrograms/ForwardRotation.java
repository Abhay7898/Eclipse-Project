package arrayPrograms;


import java.util.Arrays;

public class ForwardRotation {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int index = 7;
		for (int i = 0; i < index; i++) {
			int temp = a[i];
			a[i] = a[index];
			a[index] = temp;
			index--;
		}
		System.out.println(Arrays.toString(a));
	}
}
