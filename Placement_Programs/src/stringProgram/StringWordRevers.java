package stringProgram;

public class StringWordRevers {
	public static void main(String[] args) {
		String s = "To change this license header, choose License Headers in Project Properties";
		String words[] = s.split("\\s");
		s = "";
		for (int i = 0; i < words.length; i++) {
			char word[]=words[i].toCharArray();
			String one="";
			for (int j = word.length-1; j >=0; j--) {
				one+=word[j];
			}
			s+=one+" ";
		}
		System.out.println(s);
	}
}
