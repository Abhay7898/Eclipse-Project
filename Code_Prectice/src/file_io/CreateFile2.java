package file_io;

import java.io.File;
import java.io.IOException;

public class CreateFile2 {
	//create a file in other directory 
	
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Eclipse-Project","CreateFile2.txt");
		
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());

	}
}
