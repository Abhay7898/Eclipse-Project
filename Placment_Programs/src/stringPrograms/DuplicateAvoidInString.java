package stringPrograms;

public class DuplicateAvoidInString {
	public static void main(String[] args) {
		String s = "To change this license header, choose License Headers in Project Properties";
		char ch []=s.toCharArray();
		s="";
		for (int i = 0; i < ch.length; i++) {
			char check[]=s.toCharArray();
			boolean flage =false;
			
			for (int j = 0; j < check.length; j++) {
				
				if (ch[i]==check[j]) {
					flage=true;
					break;
				}
			}
			if (!flage) {
				s+=ch[i];
			}
		}
		System.out.println(s);
	}
}
