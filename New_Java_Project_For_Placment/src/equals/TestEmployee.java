package equals;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e= new Employee();
		e.setId(1);
		e.setName("Abhay");
		Employee e1= new Employee();
		e1.setId(1);
		e1.setName("Abhay");
		//System.out.println(e==e1);
		//System.out.println(e.equals(e));
		System.out.println(e);
		int i=10;
		int r=10;
		System.out.println(i==r);
	}
}
