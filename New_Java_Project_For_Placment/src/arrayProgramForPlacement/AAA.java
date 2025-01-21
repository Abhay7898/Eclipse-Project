package arrayProgramForPlacement;

import java.util.Arrays;

public class AAA {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		if (a==null||a.length<=1) {
			System.out.println(Arrays.toString(a));
		}else {
			int newA[]=new int[a.length];
			
			newA[0]=a[a.length-1];
			
			for (int i = 0; i < a.length-1; i++) {
				newA[i+1]=a[i];
			}
			System.out.println(Arrays.toString(newA));
		}
		
	}
}
