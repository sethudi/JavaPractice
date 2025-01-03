package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Enter Number >");
			int number =scanner.nextInt();
			System.out.println("Number is "+ number);
		}catch(Exception e) {
			System.out.println("Invalid Input");
		}
	}

}