package integerQuestionForPlacement;

public class ReversOfIInteger {
	public static void main(String[] args) {
		 int num= 167671;
		 int re=0;
		 while(num>0) {
			 int o=num%10;
			 re=(re*10)+o;
			 num=num/10;
		 }
		 System.out.print(re);
	}
}
