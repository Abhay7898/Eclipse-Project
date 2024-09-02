package concept_to_be_remember;

public final class ImmutabalitiyConcept  {
	
	// Immutabality Concept says that if we create an object then we don`t allowed to change the it`s content if there 
	// is an change in the contend then a new object is created with those change in existing object there is no change

	// every Method is implements on this concept if we not allowed any one to change
	// the contend of an object
	// if there is change in content there a new object is create with those change

	private int i;

	public ImmutabalitiyConcept(int i) {
		this.i = i;
	}

	public ImmutabalitiyConcept notChange(int i) {
		
		if (this.i == i) {
			return this;
		} else {
			return new ImmutabalitiyConcept(i);
		}
	}
}
