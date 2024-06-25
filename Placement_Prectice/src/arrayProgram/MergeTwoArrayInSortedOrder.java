package arrayProgram;

import java.util.Arrays;

public class MergeTwoArrayInSortedOrder {
	public static void main(String[] args) {
		int arrayA[] = { -7, 12, 17, 29, 41, 56, 79 };
		int arrayB[] = { -9, -3, 0, 5, 19 };
		int len = arrayA.length + arrayB.length;
		int index = 0;
		int bIndex = 0;
		int newArray[] = new int[len];
		while (index != len) {
			if (index <= arrayA.length - 1) {
				newArray[index] = arrayA[index];
				index++;
			} else {
				newArray[index] = arrayB[bIndex];
				bIndex++;
				index++;
			}
		}
		for(int i=0;i<newArray.length;i++) {
			for (int j = i+1; j < newArray.length; j++) {
				if(newArray[i]>newArray[j]) {
					int temp=newArray[j];
					newArray[j]=newArray[i];
					newArray[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(newArray));
	}
}
