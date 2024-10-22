package mymultithreading;

public class MySleepMethod {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i <10; i++) {
			System.out.println("Abhay-"+i);
			Thread.sleep(2000);
		}
	}
}
