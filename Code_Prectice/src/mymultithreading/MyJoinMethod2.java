package mymultithreading;

public class MyJoinMethod2 extends Thread {
	
	//In This child Thread have to wait for main Thread completion

	 static Thread t;

	@Override
	public void run() {
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Abhay");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyJoinMethod2.t=Thread.currentThread();
		
		MyJoinMethod2 m2 = new MyJoinMethod2();
		m2.start();
		
		m2.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Garhwal");
			Thread.sleep(500);
		}
	}
}
