package arrayPrograms;

import java.util.Arrays;

public class FullRotation {
	public static void main(String[] args) {
		int a[] = { 1, 2, 6,3, 4, 5, 6, 7,10,5};
		int index=0;
		int last=a.length-1;
		int mid=a.length/2;
		
		while (index<mid) {
			int temp=a[index];
			a[index]=a[last];
			a[last]=temp;
			index++;
			last--;
		}
		System.out.println(Arrays.toString(a));
	}
}
