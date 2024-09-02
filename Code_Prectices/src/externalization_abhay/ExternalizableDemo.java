package externalization_abhay;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableDemo implements Externalizable{
	
	private int id ;
    private String firstName;
    private String lastName;
    
    public ExternalizableDemo() {
    	System.out.println("Abhay");
    }
    
    public ExternalizableDemo(int id,String firstName,String lastName) {
    	this.id=id;
    	this.firstName=firstName;
    	this.lastName=lastName;
    }
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(firstName);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id=in.readInt();
		firstName=(String)in.readObject();
	}

	@Override
	public String toString() {
		return "ExternalizableDemo [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
