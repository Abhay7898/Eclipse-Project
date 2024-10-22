package serializationconcept;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustmizedSerialization implements Serializable{
	
	String userName = "Abhay Garhwal";
	transient String password="abhay@7898";
	
	private void writeObject(ObjectOutputStream oos) throws Exception{
		oos.defaultWriteObject();
		String epassword="123"+password;
		oos.writeObject(epassword);
	}
	
	
	private void readObject(ObjectInputStream ois)throws Exception{
		ois.defaultReadObject();
		String dpassword=(String)ois.readObject();
		password=dpassword.substring(3);
	}
}
