package integerQuestionForPlacement;

import java.util.Arrays;

public class MoveAllZeroToEndWithProperOrder {
	public static void main(String[] args) {

		// output= {2,3,5,3,7,5,2,0,0,0,0}
		int a[] = { 2, 3, 0, 5, 3, 0, 0, 7, 5, 0, 2 };
		for(int i=0;i<a.length;i++) {
			int num=a[i];
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==0&&a[j]!=0) {
					a[i]=a[j];
					a[j]=num;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}