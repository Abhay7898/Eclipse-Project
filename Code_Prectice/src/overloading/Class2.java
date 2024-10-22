package overloading;

public class Class2 {
	
	public void show(int i,float f) {
		System.out.println("int-float-arg");
	}
	
	public void show(float f,int i) {
		System.out.println("float-int-arg");
	}
}
