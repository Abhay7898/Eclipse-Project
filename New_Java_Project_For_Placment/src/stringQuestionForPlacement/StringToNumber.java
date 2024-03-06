package stringQuestionForPlacement;

public class StringToNumber {
	public static void main(String[] args) {
		String s = "3256";
		int num=0;
		
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			int assci=c[i];
			if(assci>48||assci<57) {
				num=num*10+((int)c[i] -48); 
			}
		}
		System.out.println(num);
	}
}
