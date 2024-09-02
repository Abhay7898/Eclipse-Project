package overloading_abhay;

public class Case3 {
	public void m1(String s) {
		System.out.println("String");
	}

	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer");
	}

	public static void main(String[] args) {
		Case3 c = new Case3();
		c.m1("Abhay");
		c.m1(new StringBuffer("Abhay"));
		//c.m1(null); //main point
	}
}
