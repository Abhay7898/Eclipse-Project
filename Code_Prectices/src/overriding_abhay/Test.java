package overriding_abhay;

public class Test {
	public static void main(String[] args) {
		Parent a = new Parent();
		a.show();
		
		Child b = new Child();
		b.show();
		
		Parent a1 = new Child();
		a1.show();
	}
}
