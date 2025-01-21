package stringPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class A {
	public static void main(String[] args) {
		String s = "To change this license header, choose License Headers in Project Properties";
		char c[]=s.toCharArray();
		Set s1 = new HashSet();
		for (char d : c) {
			s1.add(d);
		}
		ArrayList a = new ArrayList();
		a.add("A");
		System.out.println(a);
		System.out.println(s1);
	}
}
