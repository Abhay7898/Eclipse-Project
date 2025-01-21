package arrayP;

import java.util.Arrays;

public class FullRotation {
	public static void main(String[] args) {
		int a[] = { 1, 2,3,4,5,6,7,8,9};
		int first=0;
		int last=a.length-1;
		while (first!=a.length/2) {
			int temp=a[last];
			a[last]=a[first];
			a[first]=temp;
			first++;
			last--;
		}
		System.out.println(Arrays.toString(a));
	}
}
