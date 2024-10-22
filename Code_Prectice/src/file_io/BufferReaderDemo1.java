package file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("BufferWriterDemo1.txt"));
		String line=br.readLine();
		while (line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}
}
