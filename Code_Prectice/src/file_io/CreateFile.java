package file_io;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		//Create a file in Current directory
		
		File f = new File("CreateFile.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
	}
}
