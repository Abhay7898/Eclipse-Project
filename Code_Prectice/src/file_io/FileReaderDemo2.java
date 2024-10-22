package file_io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
	public static void main(String[] args) throws IOException {
		File f = new File("FileWriterDemo1.txt");
		
		char ch []=new char[(int)f.length()];
		
		FileReader fr = new FileReader(f);
		fr.read(ch);
		
		for (char c : ch) {
			System.out.print(c);
		}
		fr.close();
		
	} 
}
