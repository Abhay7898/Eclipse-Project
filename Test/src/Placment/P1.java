package Placment;

public class P1 {
	public static void main(String args[]) {

		String word = "zAbhay Garhwal";
		
		for (int i = 0; i <word.length(); i++) {
			int check=0;
			char ch =word.charAt(i);
			for (int j = 0; j < word.length(); j++) {
				if (i!=j&&ch==word.charAt(j)) {
					check++;
					break;
				}
			}
			if (check==0) {
				System.out.print(word.charAt(i));
				break;
			}
		}
	}
}