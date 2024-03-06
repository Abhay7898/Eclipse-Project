package file.opretion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class With_File_Class {
	
	public static String getFileContend(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner scan = new Scanner(file);
		filePath="";
		while (scan.hasNext()) {
			filePath=filePath.concat(scan.next()).concat(" ");
		}
		return filePath;
	}
	
	public static void main(String[] args) throws Exception {
		With_File_Class f = new With_File_Class();
		String st=f.getFileContend("D:\\StringFile.txt");
		System.out.println(st);
	} 
}
