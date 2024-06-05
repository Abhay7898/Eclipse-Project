package testArrays;

import java.util.Arrays;

public class BackwordRotation {
	public static void main(String[] args) {
		int a[]={1, 2, 3, 4, 5, 6, 7,8,4,3};
		int last =a.length-1;
		int index=4;
		for(int i=index;i<last;i++) {
			int tep=a[last];
			a[last]=a[index];
			a[index]=tep;
			index++;
			last--;
		}
		System.out.println(Arrays.toString(a));
	}
}
