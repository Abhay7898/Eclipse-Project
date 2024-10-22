package file_io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("FileWriterDemo1.txt");
		fw.write(100);
		fw.write('\n');
		fw.write('g');
		fw.write('\n');
		fw.write("Abhay Garhwal");
		fw.write('\n');
		fw.write(76);
		fw.write('\n');
		fw.write("End");
		fw.flush();
		fw.close();
	}
}
