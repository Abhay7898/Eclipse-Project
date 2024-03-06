package integerQuestionForPlacement;

public class PrimeNumber {
	public static void main(String[] args) {
		int prime = 256;
		boolean flage=false;
		for(int i=2;i<=prime/2;i++) {
			if(prime%i==0){
				System.out.println(prime+" Not a Prime NUmber");
				flage=true;
				break;
			}
		}
		if(!flage) {
			System.out.println(prime+" Is a Prime Number");
		}
	}
}
