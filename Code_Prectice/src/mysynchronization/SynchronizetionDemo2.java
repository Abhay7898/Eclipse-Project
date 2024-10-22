package mysynchronization;

public class SynchronizetionDemo2 {
	public static void main(String[] args) {
		
		Display d1 = new Display();
		
		Display d2 = new Display();
		
		MyThread t1 = new MyThread(d1, "Abhay");
		
		MyThread t2 = new MyThread(d2, "Golu");
		
		t1.start();
		
		t2.start();
	}
}
