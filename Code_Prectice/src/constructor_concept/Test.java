package constructor_concept;

public class Test {
	public static void main(String[] args) {
		ObjectCount obj = new ObjectCount();
		ObjectCount obj2 = new ObjectCount(10);
		ObjectCount obj3 = new ObjectCount(10.5f);
		System.out.println(ObjectCount.objectCount);
	}
}
