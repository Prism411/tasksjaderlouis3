package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class program2 {

	public static void main(String[] args) {

		
		String[] lines = new String[] {"12312312331", "213123123", "12312312312312"};
		
		String path = "c:\\temp\\out.txt";

		
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true ))){   
			bw.write("eae mano!"); //escreve "eae mano! dentro da pasta e em seguida pula uma linha"
			bw.newLine(); 
			for (String line : lines) {
				bw.write(line); //Escreve o item da posição 
				bw.newLine(); // pula uma linha 
				}
			
	//A função BufferedWriter irá criar um arquivo e escrever dentro dele atraves do bw.write, o "true" é colocado 
	// para certificar que os dados antigos escritos continuarão lá e em vez serão adicionados novos.
			
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			for(String line : lines) {
				while (line != null) {
				line = br.readLine();
				System.out.println(line);
				}
			
			}
			
			
		}
		catch (IOException e) {
		System.out.println("ERRO, O ARQUIVO NAO PODE SER LIDO!");
		e.printStackTrace();}
	}

}
