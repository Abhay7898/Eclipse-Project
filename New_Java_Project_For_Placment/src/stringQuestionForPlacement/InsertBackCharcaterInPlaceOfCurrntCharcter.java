package stringQuestionForPlacement;

public class InsertBackCharcaterInPlaceOfCurrntCharcter {
	public static void main(String[] args) {
		String s = "I Am Not Abhay Garhwal ";
		char charArray[]=s.toCharArray();
		s="";
		for(int i=0;i<charArray.length;i++) {
			int assci=charArray[i];
			if((assci>=65||assci<=90)||(assci>=97||assci<=122)) {
				if(charArray[i]==' ') {
					s+=charArray[i];
					continue;
				}
				if(charArray[i]==65) {
					charArray[i]=90;
					s+=charArray[i];
					continue;
				}else if (charArray[i]==97) {
					charArray[i]=122;
					s+=charArray[i];
					continue;
				}
				charArray[i]=(char)(assci-1);
				s+=charArray[i];
			}
		}
		System.out.println(s);
	}
}
