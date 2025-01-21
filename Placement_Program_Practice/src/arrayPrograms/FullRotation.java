package arrayPrograms;

import java.util.Arrays;

public class FullRotation {
	public static void main(String[] args) {
		int a[]= {1, 2, 3, 4, 5, 6, 7};
		int frist=0;
		int last =a.length-1;
		while (frist!=last) {
			int temp=a[frist];
			a[frist]=a[last];
			a[last]=temp;
			frist++;
			last--;
		}
		System.out.println(Arrays.toString(a));
	}
}
