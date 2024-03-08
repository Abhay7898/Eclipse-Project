package arrayProgramForPlacement;

import java.util.Arrays;

public class ForwadRotation {
	public static void main(String[] args) {
		int a[]= {1, 2, 3, 4, 5, 6, 7};
		int index=4;
		int last=a.length-1;
		for(int i= last;i>=index;i--) {
			int tem=a[index];
			a[index]=a[last];
			a[last]=tem;
			last--;
			index++;
		}
		System.out.println(Arrays.toString(a));
	}
}
