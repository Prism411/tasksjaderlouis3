package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import entities.User;
import services.Reader;

public class Program {
	
	
	public static void main(String[] args) throws IOException {
		
	Reader r = new Reader();
	r.Reading();
	System.out.println(r.Reading());
			
		}
}
