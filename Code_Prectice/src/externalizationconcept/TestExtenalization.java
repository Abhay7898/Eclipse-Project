package externalizationconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExtenalization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		MyExternalization my = new MyExternalization("Abhay", "abhay@7898", 7898);
		
		System.out.println(my);

		FileOutputStream fos = new FileOutputStream("D:\\Eclipse-Project\\Code_Prectice\\MyExternalization");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(my);

		FileInputStream fis = new FileInputStream("D:\\Eclipse-Project\\Code_Prectice\\MyExternalization");
		ObjectInputStream ois = new ObjectInputStream(fis);
		MyExternalization my2 = (MyExternalization) ois.readObject();

		System.out.println(my2);
	}
}
