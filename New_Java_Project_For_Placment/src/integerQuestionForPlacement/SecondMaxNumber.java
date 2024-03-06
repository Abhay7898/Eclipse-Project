package integerQuestionForPlacement;

public class SecondMaxNumber {
	public static void main(String[] args) {
		int num[] = {5, 34, 78, 2, 45, 1, 99, 23};
		int firstMax=num[0];
		int secoundMax = num[1];
		for(int i=0;i<num.length;i++) {
			if(num[i] > firstMax) {
				secoundMax = firstMax;
				firstMax=num[i];
			}
		}
		System.out.println(secoundMax);
	}
}
