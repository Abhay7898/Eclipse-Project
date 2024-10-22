package concept_to_be_remember;

public class Test {
	public static void main(String[] args) {
		Immutability i = new Immutability(10);
		Immutability i2= i.modify(100);
		Immutability i3= i.modify(10);
		System.out.println(i==i2);
		System.out.println(i==i3);
		
		System.out.println("----------------Case 2 ------------------");
		Immutability2 a = new Immutability2(10,20);
		Immutability2 a2= a.modify2(100,200);
		Immutability2 a3= a.modify2(10,20);
		System.out.println(a==a2);
		System.out.println(a==a3);
	}
}
