package file_io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo1 {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw =new PrintWriter("PrintWriterDemo1.txt");
		
		pw.write(100);
		pw.print(100);
		
		pw.print(true);
		
		pw.println(false);
		pw.println("Abhay Garhwal");
		pw.println(10.5d);
		pw.println(10l);
		
		pw.close();
		
	}
}
