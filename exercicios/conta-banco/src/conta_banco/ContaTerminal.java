package conta_banco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite seu nome!");
		String nome = scanner.nextLine();
		
		System.out.println("Por favor, digite o número da Agência!");
		String agencia = scanner.next();
		
		System.out.println("Por favor, digite o número da Conta!");
		int numero = scanner.nextInt();
		
		System.out.println("Por favor, digite o Saldo!");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá " + nome + ", obrigado por criar a conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já esta disponivel para saque.");

	}

}
