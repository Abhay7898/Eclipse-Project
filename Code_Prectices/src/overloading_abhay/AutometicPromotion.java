package overloading_abhay;

public class AutometicPromotion {
	//byte->short->int->long->float->double
	//char->int->long->float->double

	public void m1() {
		System.out.println("No-arg");
	}

	public void m1(int i) {
		System.out.println("Int-arg");
	}

	public void m1(float f) {
		System.out.println("Float-arg");
	}

	public static void main(String[] args) {
		AutometicPromotion a = new AutometicPromotion();
		a.m1();
		a.m1(1);
		a.m1(10.5f);
		a.m1('a'); // main Point
	  //a.m1(10.5);
	}
}
