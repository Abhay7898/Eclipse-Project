package patternPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Teat {
	/*	
	  1 
     2 2 
    3 3 3 
   4 4 4 4 
  5 5 5 5 5 
 6 6 6 6 6 6  
*/
	public static void main(String[] args) {
		String []s = {"Abhay","raj","hb","fd"};
		System.out.println(Arrays.toString(s));
		for (int i = 0; i < s.length; i++) {
			if (i==3) {
				
				s[i]="fddsds";
			}
		}
		System.out.println(Arrays.toString(s));
	}
}
