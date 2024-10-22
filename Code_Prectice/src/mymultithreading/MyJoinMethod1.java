package mymultithreading;

public class MyJoinMethod1 extends Thread {
	
	//Main Thread Has to wait for child completion
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Abhay");
			try {
				
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyJoinMethod1 j = new MyJoinMethod1();
		j.start();
		j.join(10000);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Garhwal");
		}
	}
}
