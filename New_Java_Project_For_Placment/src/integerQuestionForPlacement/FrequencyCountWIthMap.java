package integerQuestionForPlacement;

import java.util.HashMap;

public class FrequencyCountWIthMap {

	public static void main(String[] args) {
		int a[] = { -1, 2, 3, 2, 3, 4, 3, 6, 5, 4, 6, 4, 8, 8, 5, 6, 3, 2 };

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : a) {
			if (map.get(i) == null) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}
		System.out.println(map);
	}
}
