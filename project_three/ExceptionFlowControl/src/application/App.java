package application;


public class App {

	public static void main(String[] args) throws Exception {
		Person person = new Person();
		
		try {
			person.setName(null);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("the finally block");
		}
		
	}

}