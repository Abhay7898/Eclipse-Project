package arrayPrograms;

import java.util.Arrays;

public class FindSumOfFourGreaterElementInArray {
	public static int findSum(int array[]) {
		int sum=0;
		if (array.length<=4) {
			for (int i = 0; i < array.length; i++) {
				sum+=array[i];
			}
		}
		else {
			for (int i = 0; i < array.length; i++) {
				for (int j = i+1; j < array.length; j++) {
					if (array[i]>array[j]) {
						int temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
			}
			for (int i =3; i >=0; i--) {
				sum+=array[i];
			}
		}
		System.out.println(Arrays.toString(array));
		return sum;
	}
	public static void main(String[] args) {
		int array[] = { -4, 5, 6,6,7,8,};
		System.out.println(findSum(array));
	}
}
