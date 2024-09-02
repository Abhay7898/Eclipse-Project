package overloading_abhay;

public class Case2 {

	// if the work is complited at chaild levle then no need to go at pareant levle

	public void m1(String s) {
		System.out.println("String");
	}

	public void m1(Object o) {
		System.out.println("Objet");
	}

	public static void main(String[] args) {
		Case2 c = new Case2();
		c.m1("Abhay");
		c.m1(new Object());
		c.m1(null); //Main point
	}
}
