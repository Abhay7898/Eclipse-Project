package file_io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo1 {
	
	// to write data to a file line by line 
	
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("BufferWriterDemo1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(100);
		bw.newLine();
		bw.write("Abhay Garhwal");
		bw.newLine();
		bw.write('A');
		bw.newLine();
		bw.write("I am living in Burhanpur");
		bw.newLine();
		bw.write(65);
		
		bw.flush();
		bw.close();
		
	}
}
