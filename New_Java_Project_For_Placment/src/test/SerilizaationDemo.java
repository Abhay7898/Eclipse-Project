package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import stringQuestionForPlacement.StringReversWithOneOneWord;

public class SerilizaationDemo {
	
	public static void main(String[] args) throws IOException {
		Student stu= new Student();
		FileOutputStream fos=new FileOutputStream("D://Abhay.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(stu);
		oos.close();
	}
}
