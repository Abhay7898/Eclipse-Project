package stringQuestionForPlacement;

import java.util.Arrays;

public class CharterShorting {
	public static void main(String[] args) {
		char arr[] = { 'K', 'L', 'D','D', 'E', 'A', 'C', 'G', 'H' };
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++){
				char ch =Character.MIN_VALUE;
				if((int)arr[i]>(int)arr[j]) {
					ch=arr[j];
					arr[j]=arr[i];
					arr[i]=ch;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
