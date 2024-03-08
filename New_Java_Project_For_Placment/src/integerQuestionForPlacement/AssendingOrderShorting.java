package integerQuestionForPlacement;

import java.util.Arrays;

public class AssendingOrderShorting {
	public static void main(String[] args) {
		int a[] = { 5, 34, 78, 2, 45, 1, 99, 23, 78 };
		int tem = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i]>a[j]) {
					tem=a[j];
					a[j]=a[i];
					a[i]=tem;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
