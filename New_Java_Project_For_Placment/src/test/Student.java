package test;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
	int i = 1;
	String name = "Abhay";
	
	public static void main(String[] args) {
		ArrayList  l = new ArrayList ();
		l.add(null);
		l.add(null);
		l.add(null);
		l.add(null);
		System.out.println(l);
		for (Object object : l) {
			System.out.println(object);
		}
		
	}
}
