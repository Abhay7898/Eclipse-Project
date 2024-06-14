package TestArrays;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 4, 3 };
		for (int i = 0; i < a.length; i++) {
			boolean flage = false;
			int print = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					print = j;
					flage = true;
				}
			}
			if (flage) {
				continue;
			}else {
			System.out.print(a[i]+" ");
			}
		}
	}
}
