package arrayProgram;

import java.util.Arrays;

public class BackwordRotationWithGivenIndex {
	public static void main(String[] args) {
		int a[]={1, 2, 3, 4, 5, 6, 7,8,9,10,11,12};
		int index=4;
		int mid=(index+a.length-1)/2;
		int last=a.length-1;
		while (index<=mid) {
			int temp=a[last];
			a[last]=a[index];
			a[index]=temp;
			last--;
			index++;
		}
		System.out.println(Arrays.toString(a));
	}
}
