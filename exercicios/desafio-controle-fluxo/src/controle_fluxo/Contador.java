package controle_fluxo;

import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro paramentro: ");
		int paramentroUm = scanner.nextInt();
		System.out.print("Digite o segundo paramentro: ");
		int paramentroDois = scanner.nextInt();
		
		try {
			
			contar(paramentroUm, paramentroDois);
			
			
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
		}
	
		scanner.close();
	}
	
	static void contar(int paramentroUm, int paramentroDois) throws ParametrosInvalidosException {
		
		if(paramentroUm > paramentroDois)
			throw new ParametrosInvalidosException();
		
		int contagem = paramentroDois - paramentroUm;
		
		for(int i=0; i < contagem; i++)
			System.out.println("Imprimindo o número " + (i+1));	
		
	}

}

