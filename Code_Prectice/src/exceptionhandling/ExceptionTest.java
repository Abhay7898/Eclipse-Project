package exceptionhandling;

public class ExceptionTest {
	public static void main(String[] args) {
		int age = 16;
		if (age > 60) {
			throw new ToOlderException("You are to older");
		} else if (age < 18) {
			throw new ToYoungerException("You are to Younger");
		} else {
			System.out.println("Welcomme");
		}

	}
}
