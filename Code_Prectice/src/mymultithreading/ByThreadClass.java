package mymultithreading;

public class ByThreadClass extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("By Thread Class");
		}
	}

	public static void main(String[] args) {

		ByThreadClass by = new ByThreadClass();
		by.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main");
		}
	}
}
