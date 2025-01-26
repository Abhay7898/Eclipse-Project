package arrayProgramForPlacement;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class Negetive {
	public static void main(String[] args) {
		int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		int n = arr.length;

		int j = 0;

		for (int i = 0; i < n; i++) {

			if (arr[i] < 0) {

				if (i != j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));

		int j1 = 0; // Pointer for the position of the next negative number

		// Traverse the array
		for (int i = 0; i < n; i++) {
			// If the current element is negative
			if (arr[i] < 0) {
				// If i is not equal to j, we need to shift elements
				if (i != j1) {
					// Shift elements to the right to make space for the negative number
					int temp = arr[i];
					for (int k = i; k > j1; k--) {
						arr[k] = arr[k - 1];
					}
					arr[j1] = temp; // Place the negative number at the correct position
				}
				// Move the pointer to the next position
				j1++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
