/*package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	
	public static void main(String[] args) {
	
	String path = "c:\\temp\\in.txt";

	try (BufferedReader br = new BufferedReader(new FileReader(path))){
		String Line = br.readLine();
		
		while (Line != null) {
			System.out.println(Line);
			Line = br.readLine();
		}
	}
	catch (IOException e) {
		System.out.println("ERRO IO EXCEPTION");
	}

}
}*/