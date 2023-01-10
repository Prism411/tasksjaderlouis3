package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class Reader {
	
	private String Username;
	private String Date;
	
	public Reader() {
		
	}
	
	public Reader(String username, String date) {
		Username = username;
		Date = date;
	}
	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String StringReader() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\temp\\in.txt"));
		String Line = br.readLine();

		
		while (Line != null) {
			Line = br.readLine();
			String[] fields = Line.split(" ");
			System.out.println(fields[0]);
			return Line;
		}
		return Line;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reader other = (Reader) obj;
		return Objects.equals(Username, other.Username);
	}
	@Override
	public String toString() {
		return "Reader [Username=" + Username + ", Date=" + Date + "]";
	}
	
	

}
