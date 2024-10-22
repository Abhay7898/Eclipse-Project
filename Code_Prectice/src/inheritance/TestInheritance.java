package inheritance;

public class TestInheritance {
	public static void main(String[] args) {
		//parent Reference is use to hold child object but using that reference we can't call child method
		
		Parent p = new Parent();
		p.m1();
		//p.m2(); 
		
		Child c = new Child();
		c.m1();
		c.m2();
		
		Parent pc = new Child();
		pc.m1();
		//pc.m2();
	}
}
