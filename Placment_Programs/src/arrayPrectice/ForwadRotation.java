package arrayPrectice;

import java.util.Arrays;

public class ForwadRotation {
	public static void main(String[] args) {
		int a[] = { 1, 2, 6,3, 4, 5, 6, 7,10,5};
		int index=5;
		for (int i = 0; i <(a.length-5)/2; i++) {
			int temp=a[i];
			a[i]=a[index];
			a[index]=temp;
			index--;
		}
		System.out.println(Arrays.toString(a));
	}
}
