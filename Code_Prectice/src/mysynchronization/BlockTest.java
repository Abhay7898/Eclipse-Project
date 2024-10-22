package mysynchronization;

public class BlockTest {
	public static void main(String[] args) {

		Block s = new Block();

		BlockThread t = new BlockThread(s, "Abhay");

		BlockThread t2 = new BlockThread(s, "Golu");

		t.start();

		t2.start();
	}
}
