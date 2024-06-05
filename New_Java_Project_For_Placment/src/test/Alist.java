package test;

import java.util.ArrayList;
import java.util.Collections;

public class Alist {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		/*
		 * for (int i = 5; i <= 10; i++) { a.add(i); }
		 */
		a.add(12);
		a.add(13);
		a.add(17);
		a.add(57);
		
		ArrayList<Integer> a1 = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {
			a1.add(i);
		}
		a.retainAll(a1);
		System.out.println(a);
		Integer.hashCode(0);
	}
}
