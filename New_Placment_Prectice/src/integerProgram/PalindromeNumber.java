package integerProgram;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num=1441;
		int pen=0;
		int check=num;
		while (num!=0) {
			int one=num%10;
			pen=(pen*10)+one;
			num=num/10;
		}
		if (check==pen) {
			System.out.println("Pen");
		}else {
			System.out.println("Not");
		}
	}
}
