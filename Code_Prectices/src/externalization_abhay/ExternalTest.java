package externalization_abhay;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalTest {
	public static void main(String[] args) throws Exception {
		ExternalizableDemo e= new ExternalizableDemo(1,"Abhay","Garhwal");
		
		FileOutputStream fos=new FileOutputStream("D:\\Eclipse-Project\\Code_Prectices\\ExtenalTest.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		
		FileInputStream fis = new FileInputStream("D:\\Eclipse-Project\\Code_Prectices\\ExtenalTest.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ExternalizableDemo e1 =(ExternalizableDemo)ois.readObject();
		System.out.println(e1);
	}
}
