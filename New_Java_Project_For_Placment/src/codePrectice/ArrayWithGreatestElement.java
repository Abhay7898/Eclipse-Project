package codePrectice;

import java.util.Arrays;

public class ArrayWithGreatestElement {
	public static void main(String[] args) {
		int array[] = { 4, 6, 23, 10, 1, 3 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		int greater=array[array.length-1];
		int num=0;
		for(int i=0;i<array.length;i++) {
			int temp=array[i];
			 
		}
		System.out.println(greater);
	}
}
