package deadlockconditions;

public class A {

	public synchronized void a1(B b) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
		b.wish();
	}

	public synchronized void wish() {

	}
}
