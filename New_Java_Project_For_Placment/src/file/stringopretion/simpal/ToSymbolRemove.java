package file.stringopretion.simpal;

import file.opretion.With_File_Class;

public class ToSymbolRemove {
	
	public static String removeSymbols(String StringFilePath,String characterFilePsath) throws Exception {
		String inputString="";
		String inputCharter="";
		try {
			inputString=With_File_Class.getFileContend(StringFilePath);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			 inputCharter=With_File_Class.getFileContend(characterFilePsath);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
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
		//ToSymbolRemove symbolRemove = new ToSymbolRemove();
		String st =ToSymbolRemove.removeSymbols("D:\\StringFile.txt", "D:\\Symbols.txt");
		System.out.println(st);
	}
}
