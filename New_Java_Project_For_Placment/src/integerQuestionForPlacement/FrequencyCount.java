package integerQuestionForPlacement;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 2, 3, 4, 3, 6, 5, 4, 6, 4, 8, 8, 5, 6, 3, 2,32};
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			int num = a[i];
			for (int j = i; j < a.length; j++) {
				if (num == a[j]) {
					a[j] = '*';
					count++;
				}
			}
			if (num != '*') {
				System.out.println(num + " -- " + count);
			}
		}
	}
}
