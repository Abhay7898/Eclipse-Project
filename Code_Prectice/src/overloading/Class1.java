package overloading;

public class Class1 {

	public void show() {
		System.out.println("no-arg");
	}

	public void show(int i) {
		System.out.println("int-arg" + i);
	}

	public void show(float f) {
		System.out.println("float-arg" + f);
	}

	public void show(double d) {
		System.out.println("double-arg" + d);
	}
}
