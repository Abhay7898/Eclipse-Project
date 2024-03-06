package stringQuestionForPlacement;

public class PremutationAandCombinations {
	public static void main(String[] args) {
		String s = "JSPA";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for(int j=i+1;j<ch.length;j++) {
				for (int k =0; k <ch.length; k++) {
					System.out.print(ch[i]);
					System.out.print(ch[j]);
					System.out.print(ch[k]);
					System.out.println("");
				}
				
			}
			
		}
	}
}
