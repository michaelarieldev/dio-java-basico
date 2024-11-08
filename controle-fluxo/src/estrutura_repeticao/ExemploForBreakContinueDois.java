package estrutura_repeticao;

public class ExemploForBreakContinueDois {
	
	public static void main(String[] args) {
		
		for(int numero = 1; numero < 7; numero++) {
			if(numero == 5)
				continue;//continue ele não executa quando ele é chamado porem ele da continuidade no processo em diante
			System.out.println(numero);
		}
		
	}

}
