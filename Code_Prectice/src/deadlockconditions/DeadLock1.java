package deadlockconditions;

public class DeadLock1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Run");
			try {
				Thread.currentThread().join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		DeadLock1 d = new DeadLock1();
		d.start();
		
		d.join();
		
		System.out.println("Main");
	}
}
