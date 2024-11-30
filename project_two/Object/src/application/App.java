package application;


// when dealing with old API's you'll see down casting, and it's dangerous to use.
public class App {

	public static void main(String[] args) {
		
		Cat o1 = (Cat)getAnimal();
		System.out.println(o1);
	}
	
	public static Object getAnimal() {
		return new Cat();
	}

}