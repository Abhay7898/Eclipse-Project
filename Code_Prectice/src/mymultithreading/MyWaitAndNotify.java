package mymultithreading;

public class MyWaitAndNotify extends Thread {
	int total;
	@Override
	public void run() {
		
		synchronized (this) {
			System.out.println("Calculation Started");
			for (int i = 1; i <=100; i++) {
				total=total+i;
			}
			System.out.println("MyWaiting&Notify give Noticication");
			this.notify();
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		MyWaitAndNotify m = new MyWaitAndNotify();
		m.start();
		
		synchronized (m) {
			System.out.println("Main call wait Method");
			m.wait();
			System.out.println("Main got Notification");
		}
		System.out.println(m.total);
	}
}
