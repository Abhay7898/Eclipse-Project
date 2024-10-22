package file_io;

import java.io.File;

public class IsFileCheck {
	public static void main(String[] args) {
		File f =new File("D:\\Eclipse-Project");
		String s[]=f.list();
		for (String string : s) {
			
			File f1 = new File(f,string);
			if (f1.isFile()) {
				System.out.println(f1.getName()+" is file");
			} else {
				System.out.println(f1.getName()+" is directory");
			}
		}
		
	}
}
