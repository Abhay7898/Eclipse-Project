package stringProgram;

public class DunplicateAvoid {
	public static void main(String[] args) {
		String s="To change this license header, choose License Headers in Project Properties";
		boolean flage =false;
		String d="";
		
		for (int i = 0; i < s.length(); i++) {
			flage =false;
			for (int j =0; j <d.length(); j++) {
				if (s.charAt(i)==d.charAt(j)) {
					flage=true;
					break;
				}
			}
			if (!flage) {
				d+=s.charAt(i);
				
			}
		}
		System.out.println(d);
	}
}
