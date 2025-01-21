package arrayPrectice;

public class DuplicteAvoid {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 5, 6, 7, 8, 9, 10, 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < a.length; i++) {
			boolean falge =false;
			for (int j = 0; j <i; j++) {
				if (a[i]==a[j]) {
					falge=true;
					break;
				}
			}
			if (!falge) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
