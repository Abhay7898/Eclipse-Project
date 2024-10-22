package concept_to_be_remember;

public final class Immutability {

	private int i;

	public Immutability(int i) {
		this.i = i;
	}

	public Immutability modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new Immutability(i);
		}
	}
}
