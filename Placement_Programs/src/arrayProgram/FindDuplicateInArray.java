package arrayProgram;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInArray {
	public static void main(String[] args) {
		int a[] = { 2, 3, 5, 6, 3, 4, 2, 5 };
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if (!s.add(a[i])) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
