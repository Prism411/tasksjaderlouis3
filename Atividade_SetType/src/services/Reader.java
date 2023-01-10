package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import entities.User;
import services.Reader;

public class Reader {
	
	
	public Reader() {
	
	}
	
	protected String Path = "C:\\\\temp\\\\in.txt";
	public String getPath() {
		return Path;
	}
	public void setPath(String path) {
		Path = path;
	}
	public Reader(String path) {
		super();
		Path = path;
	}
	public String Reading() throws IOException {
		
		try (BufferedReader br = new BufferedReader(new FileReader(Path))) {
			Set<User> set = new HashSet<>();
			String line = br.readLine();
			while (line != null) {
			  String[] fields = line.split(" ");
			  String username = fields[0];
			  String date = fields[1];
			  User user = new User(username, date);
			  set.add(new User(username, date));
			  line = br.readLine();
			}
			return "o total eh " + set.size();
			
		
	}
	






	}}

	
	