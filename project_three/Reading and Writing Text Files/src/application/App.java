package application;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {
		File currentDirectory = new File(".");
		
		System.out.println(currentDirectory.getCanonicalPath());
		
		for(String f: currentDirectory.list()) {
			System.out.println(f);
		}
		
		System.out.println();
		
		String text ="Hello\nthere";
		Path path = Paths.get("test.txt");
		Files.write(path, text.getBytes());
		
		String retrievedText = Files.readString(path);
		System.out.println(retrievedText);

	}

}