package services;
import java.io.IOException;
import java.io.File;

public class CSVcreation  {
	protected String path;
	
	//GETTERS E SETTERS ---------------------------------
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	//GETTERS E SETTERS ---------------------------------
	
	
	public CSVcreation(String path) throws IOException {
	this.path = path;
	Creator();
	}
	


	public String Creator() throws IOException {
		boolean sucess = new File(path + "\\csvFile").mkdir(); 	
		File Path = new File(path);
		File[] files = Path.listFiles(File::isDirectory);
		String txtPath = (path + "\\csvFile\\text.txt");
		System.out.println("PASTAS");
		System.out.println();
		for (File paths : files) {
			System.out.println(paths);
		}
		
		return txtPath;

	}


}
