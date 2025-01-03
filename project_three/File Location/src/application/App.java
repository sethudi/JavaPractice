package application;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {
		String fileLocation = "C:\\\\Users\\\\stmap\\\\OneDrive\\\\Documents\\\\Github_work\\\\JavaPractice\\\\project_three\\\\File Location\\\\test.txt";
		System.out.println(new File(fileLocation).exists());

	}

}