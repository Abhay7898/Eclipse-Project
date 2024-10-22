package mysynchronization;

public class BlockThread extends Thread {

	Block b;
	String name;

	public BlockThread(Block b, String name) {
		this.b = b;
		this.name = name;
	}

	@Override
	public void run() {
		b.showName(name);
	}
}
