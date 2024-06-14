package codeprectices;

import java.util.Arrays;

public class ArrayWithGreatestElement {
	public static void main(String[] args) {
		int array[] = { 4, 6, 23, 10, 1, 3 };
		int greater=array[0];
		for (int i = 0; i < array.length; i++) {
			if(greater<array[i]) {
				greater=array[i];
			}
		}
		System.out.println(greater);
	}
}
