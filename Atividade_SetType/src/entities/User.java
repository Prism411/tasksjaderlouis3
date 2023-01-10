package entities;

import java.util.Objects;

public class User {
	
	private String Username;
	private String Date;

	
	public User(String username, String date) {
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
		User other = (User) obj;
		return Objects.equals(Username, other.Username);
	}

	
	
	

}

