package file_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CaseFile3 {
	// to write all file data into a single file
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("CaseFile3.txt");

		File f = new File("D:\\Eclipse-Project\\Code_Prectice");
		String list[] = f.list();

		for (String string : list) {
			if (!string.endsWith(".txt")) {
				continue;
			}

			File f1 = new File(f, string);
			BufferedReader bw = new BufferedReader(new FileReader(f1));
			String line = bw.readLine();
			while (line != null) {
				pw.println(line);
				line = bw.readLine();
			}
			bw.close();

		}
		pw.flush();
		pw.close();
	}
}
