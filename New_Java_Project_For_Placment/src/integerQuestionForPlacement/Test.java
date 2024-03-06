package integerQuestionForPlacement;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		//int a[] = { 1, 2, 3, 2, 3, 4, 3, 6, 5, 4, 6, 4, 8, 8, 6, 3, 2 };
		/*
		 * Map<Integer,Integer> out=new HashMap<>(); for(int i=0;i<a.length;i++) { int
		 * count =1; for(int j =i+1;j<a.length;j++) { out.put(a[i], count);
		 * if(a[i]==a[j]) { count++; a[j]=0; } } } System.out.println(out);
		 */
		
		/*
		 * for(int i=0;i<a.length;i++) { boolean flage = false; for(int
		 * j=i+1;j<a.length;j++){ if(a[j]==a[i]) { a[j]=0; flage = true; } } if(flage &&
		 * a[i] != 0) { System.out.print(a[i]); } }
		 */
		
		int a[] = { 5, 34, 78, 2, 45, 1, 99, 23 };
		int sum=0;
		for(int i=0;i<a.length;i=i+2) {
			for(int j=i+1;j<a.length;j++) {
			sum=a[i]+a[j];
			break;
			}
			System.out.println(sum);
		}
		
	}
}
