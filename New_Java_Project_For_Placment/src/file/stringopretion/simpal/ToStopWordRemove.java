package file.stringopretion.simpal;

import java.io.FileNotFoundException;

import file.opretion.With_File_Class;

public class ToStopWordRemove {
	public static String removeStopWord(String inputString, String filePath) throws FileNotFoundException {
		String [] words=inputString.toLowerCase().split(" ");
		String s= With_File_Class.getFileContend(filePath);
		String[] stopWord=s.toLowerCase().split(" ");
		inputString="";
		for (int i = 0; i < words.length-1; i++) {
			for (int j = 0; j < stopWord.length-1; j++) {
				if(words[i]==stopWord[j]) {
					words[i]=" ";
				}
			}
			inputString=inputString.concat(words[i]).concat(" ");
		}
		return inputString;
	}
	public static void main(String[] args) throws FileNotFoundException {
		String input="Our core and Java programming for tutorial am is designed for students and working professionals. Java is an object-oriented, class-based, concurrent, secured and general-purpose computer-programming language. It is a widely used robust technology.Our core and Java programming for tutorial am is designed for students and working professionals. Java is an object-oriented, class-based, concurrent, secured and general-purpose computer-programming language. It is a widely used robust ";
		String st=ToStopWordRemove.removeStopWord(input, "D:\\StopWord.txt");
		System.out.println(st);
	}
}
