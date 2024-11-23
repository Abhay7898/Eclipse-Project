package file.opretion;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class With_FileWriter_BufferWriter_class {
	
	static public boolean writeInFile(String inputString ,String filePath) {
		FileWriter fw = null;
		BufferedWriter bw =null;
		try {
			fw=new FileWriter(filePath,true);
			bw= new BufferedWriter(fw);
			if(inputString!=null) {
			bw.write(inputString+"\n");
			bw.close();
			return true;
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	public static void main(String[] args) {
		String inputString="I Am Abhay Garhwal";
		String filePath="D:\\StringFile.txt";
		With_FileWriter_BufferWriter_class fw = new With_FileWriter_BufferWriter_class();
		boolean result=fw.writeInFile(inputString,filePath);
		System.out.println(result);
	}
}
