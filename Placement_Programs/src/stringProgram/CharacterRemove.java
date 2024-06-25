package stringProgram;

public class CharacterRemove {
	//chater Remove o & h
	public static void main(String[] args) {
		String s = "To change this license header, choose License Headers in Project Properties";
		char ch []=s.toLowerCase().toCharArray();
		s="";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]=='o'||ch[i]=='h') {
				continue;
			} else {
				s+=ch[i];
			}
		}
		System.out.println(s);
	}
}
