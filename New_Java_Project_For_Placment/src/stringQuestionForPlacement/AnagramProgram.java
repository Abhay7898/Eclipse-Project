package stringQuestionForPlacement;

public class AnagramProgram {
	public static void main(String[] args) {
		 String one="Dormitory"; 
		 String two ="Dirty Room";
		 boolean flage=false;
		 char oneArr[]=one.toLowerCase().toCharArray();
		 char twoArr[]=two.toLowerCase().toCharArray();
		 for(int i=0;i<oneArr.length;i++) {
			 for (int j = 0; j < twoArr.length; j++) {
				 flage=false;
				if(oneArr[i]==' '||twoArr[j]==' ') {
					continue;
				}
				if(oneArr[i]==twoArr[j]) {
					flage=true;
					break;
				}
			}
		 }
		 if(flage==true) {
			 System.out.println("yes");
		 }else {
			System.out.println("No");
		}
	}
}
