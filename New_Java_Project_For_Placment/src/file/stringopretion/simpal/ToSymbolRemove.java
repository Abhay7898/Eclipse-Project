package file.stringopretion.simpal;

import java.io.FileNotFoundException;
import java.util.Iterator;

import file.opretion.With_File_Class;

public class ToSymbolRemove {
	
	public static String removeSymbols(String StringFilePath,String characterFilePsath) throws Exception {
		String inputString=With_File_Class.getFileContend(StringFilePath);
		String inputCharter=With_File_Class.getFileContend(characterFilePsath);
		String[] inputStringTocharter=inputString.split("\\s");
		char[] inputCharaterTochar=inputCharter.toCharArray();
		inputString="";
		
		for(int i=0;i<=inputStringTocharter.length-1;i++) {
			
			char ch[] = inputStringTocharter[i].toCharArray();
			
			
			
			for (int j = 0; j < inputCharaterTochar.length-1; j++) {
				
				if(ch[i] == inputCharaterTochar[j]) {
					ch[i]=' ';
				}
			}
			inputString=inputString.concat(inputString.valueOf(inputStringTocharter[i]));
		}
		return inputString;
	}
	
	
	public static void main(String[] args) throws Exception {
		ToSymbolRemove symbolRemove = new ToSymbolRemove();
		String st =ToSymbolRemove.removeSymbols("D:\\StringFile.txt", "D:\\Symbols.txt");
		System.out.println(st);
	}
}
