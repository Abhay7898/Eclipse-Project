package deadlockconditions;

public class ABDeadLock extends Thread {
	A a = new A();
	B b = new B();
	public void m1() {
		this.start();
		a.a1(b);
	}
	
	@Override
	public void run() {
		b.b1(a);
	}
	
	public static void main(String[] args) {
		ABDeadLock ab = new ABDeadLock();
		
		ab.m1();
	}
}
