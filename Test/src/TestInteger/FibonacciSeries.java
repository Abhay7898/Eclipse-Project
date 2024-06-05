package TestInteger;

public class FibonacciSeries {
	public static void main(String[] args) {
	int f1=-1;
	int f2=1;
	int f3=0;
	int num=20;
	for (int i = 0; i <=num; i++) {
		f3=f2+f1;
		if(f3>=20) {
			break;
		}
		System.out.println(f3);
		f1=f2;
		f2=f3;
	}
	}
}
