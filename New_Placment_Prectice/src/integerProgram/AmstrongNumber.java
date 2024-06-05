package integerProgram;

public class AmstrongNumber {
	public static void main(String[] args) {
		int num=153;
		int check=num;
		int amstrong=0;
		while (num!=0) {
			int one=num%10;
			amstrong+=one*one*one;
			num=num/10;
		}
		if(check==amstrong) {
			System.out.println("Am");
		}else {
			System.out.println("NA");
		}
	}
}
