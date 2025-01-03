package application;

public class Person {
	
	public void setName(String name) throws Exception {
		if (name == null) {
			throw new Exception("this is exception");
		}
	    System.out.println("The name is "+name);
	}
}
