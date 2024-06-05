package arrayProgram;

public class FindSumOfFourGreaterElementInArray {
	public static void main(String[] args) {
		int array[]= {3,5,6,7,5,4};
		int sum=0;
		if (array.length<4) {
			for (int i = 0; i < array.length; i++) {
				sum+=array[i];
			}
		}else {
			if(array.length<5) {
				for (int i = 0; i < array.length; i++) {
					sum+=array[i];
				}
			}else {
				for (int i = 0; i < array.length; i++) {
					for (int j = i+1; j < array.length; j++) {
						if(array[i]>array[j]) {
							int temp=array[j];
							array[j]=array[i];
							array[i]=temp;
						}
					}
				}
				for (int i =array.length-4; i<array.length; i++) {
					sum+=array[i];
				}
			}
		}
		System.out.println(sum);
	}
}
