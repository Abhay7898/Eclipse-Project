package stringQuestionForPlacement;

public class AllWhiteSpacesRemove {
	public static void main(String[] args) {
		String p = "How do you         remove   all white spaces  from a string in Java";
		String aArry[] = p.split("\\s");
		String s="";
		for (int i = 0; i < aArry.length; i++) {
			if(aArry[i].isBlank()) {
				continue;
			}
			s+=aArry[i]+" ";
		}
		System.out.println(s);
	}
}
