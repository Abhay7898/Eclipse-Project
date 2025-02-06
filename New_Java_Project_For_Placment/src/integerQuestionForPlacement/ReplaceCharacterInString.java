package integerQuestionForPlacement;

public class ReplaceCharacterInString {
	//o is to be replace
	public static void main(String[] args) {
		String myName = "domanokz";
		char ch[]=myName.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!='o') {
				System.out.print(ch[i]);
			}
		}
	}
}
