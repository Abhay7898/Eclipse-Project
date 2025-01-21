package arrayPrograms;

import java.util.Arrays;

public class BackwordRotaion {
	public static void main(String[] args) {
		int a[]={1, 2, 3, 4, 5, 6, 7,8,9,10};
		int index=3;
		int last=a.length-1;
		while (index!=last) {
			int temp=a[index];
			a[index]=a[last];
			a[last]=temp;
			index++;
			last--;
		}
		System.out.println(Arrays.toString(a));
	}
}
