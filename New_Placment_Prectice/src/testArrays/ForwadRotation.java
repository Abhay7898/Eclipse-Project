package testArrays;

import java.util.Arrays;

public class ForwadRotation {
	public static void main(String[] args) {
		int a[]= {1, 2, 3, 4, 5, 6, 7};
		int index=3;
		int last=a.length-1;
		for (int i = last; i >=index; i--) {
			int temp=a[last];
			a[last]=a[index];
			a[index]=temp;
			index++;
			last--;
		}
		System.out.println(Arrays.toString(a));
	}
}
