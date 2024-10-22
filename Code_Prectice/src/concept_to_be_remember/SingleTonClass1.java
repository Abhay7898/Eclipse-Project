package concept_to_be_remember;

public class SingleTonClass1 {

	private static SingleTonClass1 singleTonClass1 = new SingleTonClass1();
	
	private SingleTonClass1() {

	}

	public static SingleTonClass1 getSingleTonClass1() {
		return singleTonClass1;
	}
}
