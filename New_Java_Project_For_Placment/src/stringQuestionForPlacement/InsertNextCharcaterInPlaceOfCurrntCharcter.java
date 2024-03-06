package stringQuestionForPlacement;

import java.util.Arrays;

public class InsertNextCharcaterInPlaceOfCurrntCharcter {
	public static void main(String[] args) {
		String s = "i am zot abhay garhwaz";
		char charArray[] = s.toCharArray();
		s="";
		for (int i = 0; i < charArray.length; i++) {
			int assci=(int)charArray[i];
			if(charArray[i]==' ') {
				s+=charArray[i];
				continue;
			}
			if(charArray[i]==122) {
				charArray[i]=(char)97;
				s+=charArray[i];
				continue;
			}
			charArray[i]=(char)(assci+1);
			s+=charArray[i];
		}
		System.out.println(s);
	}
}
