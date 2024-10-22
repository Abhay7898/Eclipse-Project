package mysynchronization;

public class SynchronizationDemo1 {
	public static void main(String[] args) {
		Display d = new Display();
		
		MyThread t = new MyThread(d,"Abhay");
		
		MyThread t2 = new MyThread(d, "Golu");
		
		MyThread t3 = new MyThread(d, "Mayur");
		
		t.start();
		
		t2.start();
		
		t3.start();
	}
}
