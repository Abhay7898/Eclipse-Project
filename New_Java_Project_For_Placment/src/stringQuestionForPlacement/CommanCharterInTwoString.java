package stringQuestionForPlacement;

import java.util.Iterator;

public class CommanCharterInTwoString {
	public static void main(String[] args) {
		String s1 = "thinz sticks";
		String s2 = "thick bricks";
		char c1[] = s1.toLowerCase().toCharArray();
		char c2[] = s2.toLowerCase().toCharArray();
		s1="";
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c2.length; j++) {
				if(c1[i]==c2[j]) {
					s1+=c1[i];
					break;
				}
			}
		}
		System.out.println(s1);
	}
}
