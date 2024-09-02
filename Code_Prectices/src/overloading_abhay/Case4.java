package overloading_abhay;

public class Case4 {
	
	public void m1(int i, float f) {
		System.out.println("int -float");
	}

	public void m1(float f, int i) {
		System.out.println("float-int");
	}

	public static void main(String[] args) {
		Case4 c = new Case4();
		c.m1(10, 10.5f);
		c.m1(10.5f, 10);
		//c.m1(10, 10); // ambicuty
		//c.m1(10.5f,10.5f); // illegel methord call
	}
}
