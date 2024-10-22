package externalizationconcept;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class MyExternalization implements Externalizable {
	
	// if we wont  to want save the total object to the file then we used Externalization
   //because in Serialization the total object is save by the JVM
	
	String name;
	String password;
	int pinNo;

	public MyExternalization() {
		System.out.println("no-arg-constructor");
	}

	public MyExternalization(String name, String password, int pinNo) {
		this.name = name;
		this.password = password;
		this.pinNo = pinNo;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(pinNo);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		pinNo = in.readInt();
	}

	@Override
	public String toString() {
		return "MyExternalization [name=" + name + ", password=" + password + ", pinNo=" + pinNo + "]";
	}

}
