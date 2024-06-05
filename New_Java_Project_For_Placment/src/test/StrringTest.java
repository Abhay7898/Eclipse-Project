package test;

import java.util.Arrays;

public class StrringTest {
	public static void main(String[] args) {
		String s= new String("Mayur");
		/*
		 * String s1=new String("Mayur1"); System.out.println(s==s1);
		 * System.out.println(s.equals(s1));
		 */	s.replace('M','A');
		System.out.println(s);
		System.out.println(s.substring(2));
	}
}
