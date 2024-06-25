package stringProgram;

public class StringRevers {
	public static void main(String[] args) {
		String s = "To change this license header, choose License Headers in Project Properties";
		String words[]=s.split("\\s");
		s="";
		for (int i = words.length-1; i>=0; i--) {
			s+=words[i]+" ";
		}
		System.out.println(s);
	}
}
