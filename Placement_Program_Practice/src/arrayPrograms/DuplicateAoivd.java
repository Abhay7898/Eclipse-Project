package arrayPrograms;

public class DuplicateAoivd {
	public static void main(String[] args) {
		int a []= {1,2,3,4,5,6,7,1,2,3,4,5,6,7,1,3,3,5,6,7,8,89,9,0,1};
		
		
		for (int i = 0; i < a.length; i++) {
			int count=1;
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					count++;
					break;
				}
			}
			if (count==1) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
