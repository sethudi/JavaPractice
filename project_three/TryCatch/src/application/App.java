package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		String line = scanner.nextLine();
		
		int value =0;
		try {
			value =Integer.parseInt(line);
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid Number!");
		}
		 
		System.out.println(String.format("you entered %d", value));
		
		scanner.close();
	}

}