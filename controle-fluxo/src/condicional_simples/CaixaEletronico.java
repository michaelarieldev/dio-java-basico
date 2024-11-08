package condicional_simples;

public class CaixaEletronico {
	
	public static void main(String[] args) {
		double saldo = 25.00;
		double valorSolicidado = 17.00;
		
		if (valorSolicidado < saldo) {
			saldo = saldo - valorSolicidado;
			
			
		}
		System.out.println("Saldo: " + saldo);
	}
	
}
