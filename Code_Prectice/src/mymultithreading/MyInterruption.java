package mymultithreading;

public class MyInterruption extends Thread {
	@Override
	public void run() {
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("I am lazy Thread");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("I am Interruped");
		}
	}

	public static void main(String[] args) {

		MyInterruption m = new MyInterruption();
		m.start();
		m.interrupt();

		System.out.println("End of Main");
	}
}
