import java.util.Locale;
import java.util.Scanner;

public class Ex1ValorDePI {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		double area, raio, pi = 3.14159;
		System.out.println("Insira o valor do raio");
		raio = leitor.nextDouble();
		area = pi * raio * raio;
		System.out.printf("A area eh %.4f%n ", area);
		
		
		leitor.close();
				
		

	}

}
