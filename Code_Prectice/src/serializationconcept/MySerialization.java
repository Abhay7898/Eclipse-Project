package serializationconcept;

import java.io.Serializable;

public class MySerialization implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String userName="Abhay";
	transient String password="abhay@";
}
