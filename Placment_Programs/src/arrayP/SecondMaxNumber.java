package arrayP;

public class SecondMaxNumber {
	public static void main(String[] args) {
		int a[] = { 100, 34, 78, 2, 45, 1, 99, 23 };
		int frist=a[0];
		int sec=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>frist) {
				sec=frist;
				frist=a[i];
			}
		}
		System.out.println(sec);
	}
}
