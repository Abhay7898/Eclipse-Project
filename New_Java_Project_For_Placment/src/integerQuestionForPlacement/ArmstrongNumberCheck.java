package integerQuestionForPlacement;

public class ArmstrongNumberCheck {
	public static void main(String[] args) {
		int n =152;
		int amstrong=n;
		int total=0;
		while(n!=0) {
			int o=n%10;
			total+= o*o*o;
			n=n/10;
		}
		if(amstrong==total) {
			System.out.println(amstrong+" is a Amstrong Number ");
		}else {
			System.out.println(amstrong+" is Not a Amstrong Number");
		}
	}
}
