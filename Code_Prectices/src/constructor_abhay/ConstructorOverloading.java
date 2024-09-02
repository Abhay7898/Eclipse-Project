package constructor_abhay;

public class ConstructorOverloading {

	public ConstructorOverloading() {
		System.out.println("no-arg");
	}

	public ConstructorOverloading(int i) {
		System.out.println("Int-arg");
	}

	public ConstructorOverloading(long l) {
		System.out.println("Long-arg");
	}

	public ConstructorOverloading(double d) {
		System.out.println("Double-arg");
	}

	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading();
	}
}
