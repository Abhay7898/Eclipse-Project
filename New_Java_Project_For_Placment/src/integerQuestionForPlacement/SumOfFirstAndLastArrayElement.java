package integerQuestionForPlacement;

import java.util.Arrays;

public class SumOfFirstAndLastArrayElement {
	public static void main(String[] args) {
		int num[] = {5, 34, 78, 2, 45, 1, 99, 23};
		int newArray[]=new int [num.length/2];
		
		int first = 0;
		int last = num.length-1;
		
		int index=0;
		for(int i=0;i<num.length/2;i++) {
			
			newArray[index++]=num[first]+num[last];
			first++;
			last --;
		}
		System.out.println(Arrays.toString(newArray));
	}
}
