package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import services.Reader;

public class Program {
	
	
	public static void main(String[] args) throws IOException {
		

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\temp\\in.txt"))) {
			Set<Reader> set = new HashSet<>();
			String line = br.readLine();
			while (line != null) {
			  String[] fields = line.split(" ");
			  String username = fields[0];
			  String date = fields[1];
			  Reader reader = new Reader(username, date);
			  set.add(new Reader(username, date));
			  line = br.readLine();
			}
			System.out.println("Total Users:" + set.size()); 

			for (Reader e: set) {
				System.out.println(e);
			}
			
		}
}
}