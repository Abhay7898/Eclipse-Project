package arrayPrectice;

import java.util.Arrays;

public class FindSumOfFourGreaterElementInArray {
	public static void main(String[] args) {
		int sum=0;
		int a[]= {1, 2, 3, 4, 5, 6, 7};
		if (a.length<=4) {
			for (int i = 0; i < a.length; i++) {
				sum+=a[i];
			}
		}else {
			for (int i = 0; i < a.length; i++) {
				for (int j = i+1; j < a.length; j++) {
					if (a[i]>a[j]) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println(Arrays.toString(a));
			for (int j =a.length-1; j>=a.length-4; j--) {
				sum+=a[j];
			}
		}
		System.out.println(sum);
	}
}
