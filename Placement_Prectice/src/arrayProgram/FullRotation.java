package arrayProgram;

import java.util.Arrays;

public class FullRotation {
	public static void main(String[] args) {
		int a[] = { 1, 2, 6,3, 4, 5, 6, 7,10,5};
		int frist=0;
		int last=a.length-1;
		int count =a.length/2;
		while (frist!=count) {
			int temp=a[last];
			a[last]=a[frist];
			a[frist]=temp;
			frist++;
			last--;
		}
		System.out.println(Arrays.toString(a));
	}
}
