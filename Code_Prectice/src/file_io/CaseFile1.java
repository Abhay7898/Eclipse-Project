package file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CaseFile1 {
	
	// to merge the two file data into a single file
	
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("CaseFile1.txt");

		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo1.txt"));
		String line = br.readLine();
		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}
		br = new BufferedReader(new FileReader("BufferWriterDemo1.txt"));
		line = br.readLine();
		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}
}
