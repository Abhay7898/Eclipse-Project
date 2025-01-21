package arrayP;

public class Test {
	
	public static void main(String[] args) {
		
		String s="Abhay";
		String s1="Abhay";
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		StringBuffer sb = new StringBuffer("Abhay");
		StringBuffer sb1 = new StringBuffer("Abhay");
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));
		
		Student st=new Student(1, "Abhay");
		Student st1=new Student(1, "Abhay");
		System.out.println(st==st1);
		System.out.println(st.equals(st1));
		
		
	}
}