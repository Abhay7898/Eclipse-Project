package constructor_abhay;

public class CountObjectCreation {
	static int count = 0;
	{
		count++;
	}

	public CountObjectCreation() {
		
	}

	public CountObjectCreation(int i) {
	}

	public static void main(String[] args) {
		CountObjectCreation c = new CountObjectCreation();
		CountObjectCreation c1 = new CountObjectCreation();
		CountObjectCreation c2 = new CountObjectCreation();
		CountObjectCreation c3 = new CountObjectCreation();
		System.out.println(count);
	}
}
