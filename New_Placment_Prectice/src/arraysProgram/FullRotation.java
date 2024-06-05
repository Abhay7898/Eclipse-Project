package arraysProgram;

import java.util.Arrays;

public class FullRotation {
	public static void main(String[] args) {
		int a[] = { 1, 2, 6,3, 4, 5, 6, 7,10,5};
		int frist=0;
		int last=a.length-1;
		int mid=a.length/2;
		while (frist<mid) {
			int tem=a[last];
			a[last]=a[frist];
			a[frist]=tem;
			frist++;
			last--;
			}
		System.out.println(Arrays.toString(a));
	}
}
