package integerQuestionForPlacement;

import java.util.Arrays;

public class EvenNumber {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 2, 3, 4, 3, 6, 5, 4, 6, 4, 8, 8, 5, 6, 3, 2 };
		int newArray[]=new int[num.length];
		int index=0;
		for(int i =0;i<num.length;i++) {
			if(num[i]%2==0) {
				boolean flag = false;
				for(int j=0;j<newArray.length;j++) {
					
					if(newArray[j]==num[i]) {
						flag = true;
					}
				}
				if(!flag) {
					newArray[index]=num[i];
					index++;
				}
			}
		}
		System.out.println(Arrays.toString(newArray));
	}
}
