package file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CaseFile4 {
	public static void main(String[] args) throws IOException {
		
		// to read the data from two file and write without duplicate into one file
		PrintWriter pw = new PrintWriter("CaseFile4.txt");

		BufferedReader bw1 = new BufferedReader(new FileReader("FileWriterDemo1.txt"));
		String line = bw1.readLine();

		while (line != null) {
			Boolean flage = false;
			
			BufferedReader bw2 = new BufferedReader(new FileReader("BufferWriterDemo1.txt"));
			String line2 = bw2.readLine();
			
			while (line2 != null) {
				if (line.equals(line2)) {
					flage = true;
					break;
				}
				line2=bw2.readLine();
			}
			if (flage==false) {
				pw.println(line);
			}
			line=bw1.readLine();
		}
		bw1.close();
		pw.flush();
		pw.close();
	}
}
