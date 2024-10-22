package mymultithreading;

public class ByRunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("By Runnable Interface");
	}

	public static void main(String[] args) {
		ByRunnableInterface r = new ByRunnableInterface();
		Thread t = new Thread(r);
		t.start();
		System.out.println("Main");
	}
}
