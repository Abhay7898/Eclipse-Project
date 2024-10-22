package stringQuestionForPlacement;

public class StringReversWithProperOrder {
	public static void main(String[] args) {
		
		String k = "hello a world java javatpoint";
		String withoutSpace=k.replaceAll("\\s", "");
		
		char charArrayWithOutSpace[]=withoutSpace.toCharArray();
		
		char charArrayWithSpace[]=k.toCharArray();
		
		int ch=charArrayWithOutSpace.length;
		for(int i=charArrayWithOutSpace.length-1;i>=0;i--) {
			
			for(int j=0;j<charArrayWithSpace.length;j++) {
				
			}
		}
	}
}
