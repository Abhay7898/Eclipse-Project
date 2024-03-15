package arrayProgram;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayReversWithSameArray {
	public static void main(String[] args) {
		int a[]={1, 2, 3, 4, 5, 6, 7,8,4,3};
		int frist=0;
		int last=a.length-1;
		int mid=a.length/2;
		while (frist<mid) {
			int temp=a[last];
			a[last]=a[frist];
			a[frist]=temp;
			frist++;
			last--;
		}
		System.out.println(Arrays.toString(a));
	}
}
