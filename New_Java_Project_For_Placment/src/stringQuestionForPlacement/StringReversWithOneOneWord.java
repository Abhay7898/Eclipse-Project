package stringQuestionForPlacement;

public class StringReversWithOneOneWord {
	public static void main(String[] args) {
		String st = "hello a world java javatpoint";
		// 			tniop t avaj vajd 
		String s[] = st.split("\\s");
		st = "";
		for (int i = 0; i < s.length; i++) {
			String word = "";
			String n =s[i];
			char ch []=n.toCharArray();
				for(int j=ch.length-1;j>=0;j--) {
					word += ch[j];
				}
			st += word + " ";
				
		}
		System.out.println(st);
	}
}
