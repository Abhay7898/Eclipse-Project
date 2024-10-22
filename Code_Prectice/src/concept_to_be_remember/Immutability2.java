package concept_to_be_remember;

public final class Immutability2 {

	private int i;
	private int j;

	public Immutability2(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public Immutability2 modify2(int i, int j) {
		if (this.i == i && this.j == j) {
			return this;
		} else {
			return new Immutability2(i, j);
		}
	}
}
