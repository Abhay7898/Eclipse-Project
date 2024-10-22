package overriding;

public class Child extends Parent {
	
	@Override
	public void property(int amount) {
		System.out.println("Child Property Method" + amount);
	}
	
}
