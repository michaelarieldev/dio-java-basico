package estrutura_repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
	
	public static void main(String[] args) {
		
		double mesada = 50.0;
		int quantidadeDoce = 0;
		
        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;
            
        	quantidadeDoce++;
        	
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Foram comprados " + quantidadeDoce + " doces");
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
        
        //não vamos nos preocupar quanto a formatação de valores
        //vamos explorar os recursos de formatação em breve
        		
	}
	//sera apresentado futuramento sobre metodos
	private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2, 8);
	}

}
