package mysynchronization;

public class Block {

	public void showName(String name) {
		
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.print("Good Night : ");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				System.out.println(name);
			}
		}
		
	}
}
