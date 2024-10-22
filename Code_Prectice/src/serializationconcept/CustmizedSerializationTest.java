package serializationconcept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustmizedSerializationTest {
	public static void main(String[] args) throws Exception {
		
		CustmizedSerialization cs = new CustmizedSerialization();
		System.out.println(cs.userName + "---" + cs.password);
		
		
		FileOutputStream fos = new FileOutputStream("D:\\Eclipse-Project\\Code_Prectice\\CustmizedSerialization");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cs);

		FileInputStream fis = new FileInputStream("D:\\Eclipse-Project\\Code_Prectice\\CustmizedSerialization");
		ObjectInputStream ois = new ObjectInputStream(fis);
		CustmizedSerialization cs2 = (CustmizedSerialization) ois.readObject();
		
		System.out.println(cs2.userName + "---" + cs2.password);
	}
}
