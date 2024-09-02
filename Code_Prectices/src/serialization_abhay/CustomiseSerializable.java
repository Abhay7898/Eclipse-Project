package serialization_abhay;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomiseSerializable implements Serializable {
	 String userName="Abhay";
	 transient String password="Abh@y7898";
	
	private void writeObject(ObjectOutputStream oos) throws Exception{
		oos.defaultWriteObject();
		String s = "@123"+password;
		oos.writeObject(s);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();
		String s=(String)ois.readObject();
		password=s.replaceAll("@123","");
	}
	
	@Override
	public String toString() {
		return userName+" "+ password;
	}
}
