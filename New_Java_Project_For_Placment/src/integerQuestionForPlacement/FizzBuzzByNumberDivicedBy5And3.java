package integerQuestionForPlacement;

public class FizzBuzzByNumberDivicedBy5And3 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.println(i+"/3 :- "+"Fizz");
			} if(i%5==0) {
				System.out.println(i+"/5 :- "+"Buzz");
			} if(i%3==0&&i%5==0) {
				System.out.println(i+"/5 And 3 :- "+"FizzBuzz");
			}
		}
	}
}
