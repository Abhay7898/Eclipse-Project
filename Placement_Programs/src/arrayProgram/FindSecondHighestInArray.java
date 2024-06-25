package arrayProgram;

public class FindSecondHighestInArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 6,3, 4, 5, 6, 7,10,5};
		int first=a[0];
		int second=a[1];
		for (int i = 0; i < a.length; i++) {
			if (first<a[i]) {
				second=first;
				first=a[i];
			}
		}
		System.out.println(second);
		System.out.println(first);
	}
}
