package arrayProgram;

import java.util.Arrays;

public class ForwordRotationWithGivenIndex {
	public static void main(String[] args) {
		int a[]= {1, 2, 3, 4, 5, 6, 7};
		int last=4;
		int frist=0;
		int mid =(last+frist)/2;
		while (frist<=mid) {
			int temp=a[last];
			a[last]=a[frist];
			a[frist]=temp;
			frist++;
			last--;
		}
		System.out.println(Arrays.toString(a));
	}
}
