package extrutura_excepcional;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploTryCath {

	public static void main(String[] args) {
		try {
			//criando o objeto scanner
			
			Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
			
			System.out.print("Digite seu nome: ");
			String nome = scanner.next();
			
			System.out.print("Digite seu sobrenome: ");
			String sobrenome = scanner.next();
			
			System.out.print("Digite seu idade: ");
			int idade = scanner.nextInt();
			
			System.out.print("Digite sua altura: ");
			double altura = scanner.nextDouble();
			
	        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
	        System.out.println("Tenho " + idade + " anos ");
	        System.out.println("Minha altura é " + altura + "cm ");
	        scanner.close();
		}catch (InputMismatchException e) {
			System.err.println("Os campos idade e altura aceita somente digitos numéricos");
		}
	}

}
