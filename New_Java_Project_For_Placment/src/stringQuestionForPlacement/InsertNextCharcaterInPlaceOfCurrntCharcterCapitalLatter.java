package stringQuestionForPlacement;

public class InsertNextCharcaterInPlaceOfCurrntCharcterCapitalLatter {
	public static void main(String[] args) {
		String s = "A AM ZOT ABHAY GARHWAL";
		char charArray[]=s.toCharArray();
		s="";
		for(int i=0;i<charArray.length;i++){
			int assci=(int)charArray[i];
			if(charArray[i]==' ') {
				s+=charArray[i];
				continue;
			}
			if((int)charArray[i]==90) {
				charArray[i]=(char)65;
				s+=charArray[i];
				continue;
			}
			charArray[i]=(char)(assci+1);
			s+=charArray[i];
		}
		System.out.println(s);
	}
}
