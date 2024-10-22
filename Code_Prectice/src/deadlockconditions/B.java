package deadlockconditions;

public class B {
	public synchronized void b1(A a)  {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		a.wish();
	}
	
	public synchronized void wish() {
		
	}
}
