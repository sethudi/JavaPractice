package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		String fileLocation = "C:\\\\Users\\\\stmap\\\\OneDrive\\\\Documents\\\\Github_work\\\\JavaPractice\\\\project_three\\\\File Location\\\\test.txt";
		System.out.println(new File(fileLocation).exists());
		System.out.println();
		
		try(BufferedReader reader = new BufferedReader(new FileReader(fileLocation))) {
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch(FileNotFoundException e) {
			System.err.println("File not found: " + fileLocation);
		}
		catch(IOException e) {
			System.out.println("Error reading file: " + fileLocation);
		}
	}

}