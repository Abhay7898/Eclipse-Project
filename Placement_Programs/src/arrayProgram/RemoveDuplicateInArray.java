package arrayProgram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInArray {
	public static void main(String[] args) {
		int a[] = {6,6,7,8,9,5,4,3,5,7,8,9,4,76,5,5,7,5,5,6,4,3,2,6,6,7,7};
		Set<Integer> s= new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if (!s.contains(a[i])) {
				s.add(a[i]);
			} 
		}
		System.out.println(s);
	}
}
