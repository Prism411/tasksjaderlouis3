package services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import entities.Product;

public class CSVedition {
	
	String textpath;

	public CSVedition(String textpath) {
		super();
		this.textpath = textpath;
	}

	public String getTextpath() {
		return textpath;
	}

	public void setTextpath(String textpath) {
		this.textpath = textpath;
	}
	
	public void TextCreate(String textpath, String TexttoCreate) throws IOException {
		this.textpath = textpath;
		BufferedWriter br = new BufferedWriter(new FileWriter(textpath, true));
		String textinput = 	TexttoCreate;
		System.out.println(textinput);
		br.write(textinput);
		br.newLine();
		br.close();
	}

	
	
}
