package file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CaseFile5 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("CaseFile5.txt");

		BufferedReader bw1 = new BufferedReader(new FileReader("CreateFile.txt"));
		String line = bw1.readLine();

		while (line != null) {
			boolean flage = false;

			BufferedReader bw2 = new BufferedReader(new FileReader("CaseFile5.txt"));
			String target = bw2.readLine();

			while (target != null) {
				if (line.equals(target)) {
					flage = true;
					bw2.close();
					break;
				}
				target = bw2.readLine();
			}
			if (!flage) {
				pw.println(line);
				pw.flush();
			}
			line = bw1.readLine();
		}
		bw1.close();
		pw.close();
	}
}
