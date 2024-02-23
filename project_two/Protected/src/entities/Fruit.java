package entities;

public class Fruit {
	// You can't access it outside the entities package
	protected int id;

	@Override
	public String toString() {
		return "Fruit [id=" + id + "]";
	}
	
	
}