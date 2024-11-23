package stringPrograms;

import java.util.Iterator;

public class AA {
	public static void main(String[] args) {
		String s = "To change this license header, choose License Headers in Project Properties";
		char ch[] = s.toCharArray();
		s="";
		for (int i = 0; i < ch.length; i++) {
			boolean flage = false;
			char check []=s.toCharArray();
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
