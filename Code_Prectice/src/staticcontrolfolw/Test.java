package staticcontrolfolw;

public class Test {
	static int i = 20;
	static {
		m1();
	}

	public static void m1() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		m2();
	}

	static {
		m2();
	}

	public static void m2() {
		System.out.println(j);
	}

	static int j = 30;
}
