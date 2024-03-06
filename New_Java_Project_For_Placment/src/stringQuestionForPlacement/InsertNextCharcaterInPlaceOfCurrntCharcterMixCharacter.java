package stringQuestionForPlacement;

public class InsertNextCharcaterInPlaceOfCurrntCharcterMixCharacter {
	public static void main(String[] args) {
		String s="I Am Not Zbhay Garhwa";
		char charArray[]=s.toCharArray();
		s="";
		for(int i=0;i<charArray.length;i++){
			int assci=charArray[i];
			if((assci>=65||assci<=90)||(assci>=97||assci<=122)) {
				if(charArray[i]==' ') {
					s+=charArray[i];
					continue;
				}
				if(charArray[i]==122) {
					charArray[i]=97;
					s+=charArray[i];
					continue;
				}else if(charArray[i]==90){
					charArray[i]=65;
					s+=charArray[i];
					continue;
				}
				charArray[i]=(char)(assci+1);
				s+=charArray[i];
			}
		}
		System.out.println(s);
	}
}
