package serialization_abhay;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {
	public static void main(String[] args) throws Exception {
		
		CustomiseSerializable a = new CustomiseSerializable();
		System.out.println(a);
		
		FileOutputStream fos= new FileOutputStream("D:\\Eclipse-Project\\Code_Prectices\\Customise.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		FileInputStream fis= new FileInputStream("D:D:\\Eclipse-Project\\Code_Prectices\\Customise.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		CustomiseSerializable a1 = (CustomiseSerializable)ois.readObject();
		System.out.println(a1);
		
	}
}
