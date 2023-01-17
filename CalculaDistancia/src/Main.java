import java.util.Scanner;
import java.util.Locale;



public class Main {


    
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double pontoA = 0;
		double pontoB = 0;
		double Resultado = 0;
		
		try (Scanner scan = new Scanner(System.in)) {
		System.out.println("Insira o Ponto A: ");
		pontoA = scan.nextDouble();
		System.out.printf("Insira o Ponto B: %n");
		pontoB = scan.nextDouble();
		
		Resultado = pontoA - pontoB;
		
		System.out.printf("O resultado eh: %.2f METROS", Resultado);
		
		}

	}

}
