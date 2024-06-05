package TestArrays;

import java.util.Arrays;

public class FullRotation {
	public static void main(String[] args) {
		int a[] = { 1, 2, 6,3, 4, 5, 6, 7,10,5};
		int first=0;
		int last=a.length-1;
		int check=a.length/2;
		while (first<check) {
			int temp=a[last];
			a[last]=a[first];
			a[first]=temp;
			first++;
			last--;
		}
		System.out.println(Arrays.toString(a));
	}
}
