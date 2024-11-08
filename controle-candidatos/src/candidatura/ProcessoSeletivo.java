package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		
		String [] candidatos = {"GISELA", "LUCAS", "LARISA", "ANTONIA", "JOSE"};
		
		for(String candidato : candidatos)
			entrandoEmContato(candidato);
		
	}
	
	static void entrandoEmContato(String candidato) {
		
		int tentativasRealizadas = 0;
		boolean ligarNovamente = true;
		boolean atendeu = false;
		
		do {
			
			atendeu = atender();
			ligarNovamente = !atendeu;
			
			if(ligarNovamente)
				tentativasRealizadas++;
			
			else
				System.out.println("Contato realizado com sucesso!");
			
		} while (ligarNovamente && tentativasRealizadas < 3);
		
		if (atendeu)
			System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
		else
			System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas " + tentativasRealizadas + " realizados");
		
	}
	
	//metodo auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"GISELA", "LUCAS", "LARISA", "ANTONIA", "JOSE"};
		
		System.out.println("Imprimindo a lista de candidatos informando o índice do elemento\n");
		
		for(int indice=0; indice<candidatos.length;indice++) {
			System.out.println("O(A) candidato(a) do nº " + (indice + 1) + " é o(a) candidato(a) " + candidatos[indice]);
		}
		
		System.out.println("\nForma abrevida for each\n");
		
		for(String candidado : candidatos) {
			
			System.out.println("Candidato(a) foi selecionado(a) " + candidado);
		}
	}
	
	static void selecaoCandidatos() {
		
		String [] candidados = {"MARIA", "JOÃO", "PEDRO", "CARLOS", "GISELA", "LUCAS", "LARISA", "ANTONIA", "JOSE", "RICARDO"};
		
		int candidadosSelecionados = 0;
		int candidadoAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidadosSelecionados < 5 && candidadoAtual < candidados.length) {
			
			String candidato = candidados[candidadoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O(A) candidato(a) " + candidato + " solicitou esse valor de salário " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O(A) candidado(a) " + candidato + " foi selecionado(a) para a vaga");
				candidadosSelecionados++;
			}
			candidadoAtual++;
			
		}
	}
	
	
	static double valorPretendido() {
		
		return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
		
	}
	
	static void analizarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if(salarioPretendido < salarioBase) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if(salarioPretendido == salarioBase) {
			System.out.println("LIGAR PARA O CANDIDADO COM CONTRA PROPOSTA");
		}else {
			System.out.println("AGUARDAR DEMAIS CANDIDADOS");
		}
		
	}
	
}
