package serializationconcept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MySerializationTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		MySerialization my = new MySerialization();
		System.out.println(my.userName+"___"+my.password);
		
		
		FileOutputStream fos = new FileOutputStream("D:\\Eclipse-Project\\Code_Prectice\\MySerialization");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(my);
		
		FileInputStream fis = new FileInputStream("D:\\Eclipse-Project\\Code_Prectice\\MySerialization");
		ObjectInputStream ois = new ObjectInputStream(fis);
		MySerialization my2=(MySerialization)ois.readObject();
		System.out.println(my2.userName+"---"+my2.password);
	}
}
