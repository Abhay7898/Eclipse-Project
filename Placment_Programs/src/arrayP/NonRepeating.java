
package arrayP;

public class NonRepeating {
	public static void main(String[] args) {
		int a []= {1,2,3,4,5,6,7,1,2,3,4,5,6,7,1,3,3,5,6,7,8,89,9,0,1};
		for (int i = 0; i < a.length; i++) {
			boolean flage =false;
			for (int j = 0; j < a.length; j++) {
				if (i!=j&&a[i]==a[j]) {
					flage=true;
					break;
				}
			}
			if (!flage) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
