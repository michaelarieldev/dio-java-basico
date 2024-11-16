package lanchonete.atendimento.cozinha;

public class Almoxarife {
	
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarSaida();
	}
	//sem o "public" ele se torna default e só quem esta no mesmo nível de pacote consegue ver
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}

}
