package application;

public class Cat {
	private String name;
	public static final String FOOD = "Cat food"; 
	private static int count = 0;

	public Cat(String name) {
		this.name = name;
		count++;
	}
	
	//Can only be used to access static variables 
	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	
	
}