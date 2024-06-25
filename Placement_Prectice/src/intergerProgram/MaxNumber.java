package intergerProgram;

public class MaxNumber {
	public static void main(String[] args) {
		int num[] = { 5, 34,99, 78, 2, 45, 1, 23 };
		int max=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println();
	}
}
