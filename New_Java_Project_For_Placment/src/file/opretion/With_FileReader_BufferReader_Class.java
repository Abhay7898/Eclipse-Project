package file.opretion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class With_FileReader_BufferReader_Class {
	public static String getFilecontend(String filePath){
		FileReader fr = null;
		BufferedReader br = null;
		String output="";
		try {
			fr=new FileReader(filePath);
			br=new BufferedReader(fr);
			while(output!=null) {
				if(br.readLine()==null) {
					break;
				}
				output = output.concat(br.readLine());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return output;
	}
	
	public static void main(String[] args) {
		With_FileReader_BufferReader_Class fb = new With_FileReader_BufferReader_Class();
		String st=fb.getFilecontend("D:\\StringFile.txt");
		System.out.println(st);
	}
}
