package concept_to_be_remember;

public class SingleTonClass2 {
	
	private static SingleTonClass2 singleTonClass2 = null;

	private SingleTonClass2() {
		
	}

	public static SingleTonClass2 getSingleTonClass2() {
		if (singleTonClass2 == null) {
			singleTonClass2 = new SingleTonClass2();
		}
		return singleTonClass2;
	}
}
