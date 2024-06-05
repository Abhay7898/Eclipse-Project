package arraysProgram;

import java.util.Arrays;
import java.util.Collections;

public class ArrayShorting {
	public static void main(String[] args) {
		int a[] = { 1, 2, 6,3, 4, 5, 6, 7,10,5};
		//Arrays.sort(a,Collections.reverseOrder());
		for(int i=0;i<a.length;i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
	}
}
