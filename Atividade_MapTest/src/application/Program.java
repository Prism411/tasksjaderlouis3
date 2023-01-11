package application;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.Parser;

import entities.Candidate;

public class Program {
	

	public static void main(String[] args) throws IOException {
	    Map<String, Candidate> map = new HashMap<>();
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter file path");
	    String path = "c:\\temp\\eleicao.txt";
	    File file = new File(path);
	    if (!file.exists()) {
	        throw new FileNotFoundException("File not found at " + path);
	    }
	    BufferedReader br = new BufferedReader(new FileReader(path));
	    String line = br.readLine();
	    while (line != null) {
	        String[] fields = line.split(",");
	        String name = fields[0];
	        int count = Integer.parseInt(fields[1]);
	        if (map.containsKey(name)) {
	            Candidate candidate = map.get(name);
	            candidate.addVote(count);
	        } else {
	            map.put(fields[0], new Candidate(fields[0], Integer.parseInt(fields[1])));
	        }
	        line = br.readLine();
	    }
	    br.close();
	    sc.close();
	    for (String e : map.keySet()) {
	        System.out.println(e + ": " + map.get(e).getVoteCount());
	    }
	}
}
