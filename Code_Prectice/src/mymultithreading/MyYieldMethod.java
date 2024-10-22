package mymultithreading;

public class MyYieldMethod extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}

	public static void main(String[] args) {
		MyYieldMethod m = new MyYieldMethod();
		m.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
