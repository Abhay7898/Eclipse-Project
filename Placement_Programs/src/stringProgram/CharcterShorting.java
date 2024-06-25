package stringProgram;

import java.util.Arrays;

public class CharcterShorting {
	public static void main(String[] args) {
		char arr[] = { 'K', 'L', 'D', 'D', 'E', 'A', 'C', 'G', 'H' };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					char c=arr[j];
					arr[j]=arr[i];
					arr[i]=c;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
