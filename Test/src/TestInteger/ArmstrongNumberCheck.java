package TestInteger;

public class ArmstrongNumberCheck {
	public static void main(String[] args) {
		int num=15;
		int check=num;
		int amstrong=0;
		while (num!=0) {
			int one =num%10;
			amstrong+=one*one*one;
			num=num/10;
		}
		
	}
}
