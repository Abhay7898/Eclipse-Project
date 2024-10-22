package constructor_concept;

public class ObjectCount {
	static int objectCount = 0;
	{
		objectCount++;
	}

	public ObjectCount() {
		System.out.println("no-arg");
	}

	public ObjectCount(int i) {
		System.out.println("int-arg");
	}

	public ObjectCount(float f) {
		System.out.println("float-arg");
	}
}
