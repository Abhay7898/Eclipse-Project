package arrayProgram;

import java.util.Arrays;

public class Rotation {
	public static void main(String[] args) {
		int a[] = { 1, 2, 6,3, 4, 5, 6, 7,10,5};
		int first=0;
		int last=a.length-1;
		int middel=a.length/2;
		while (first<middel) {
			int temp=a[last];
			a[last]=a[first];
			a[first]=temp;
			first++;
			last--;
		}		
		System.out.println(Arrays.toString(a));
	}
}
