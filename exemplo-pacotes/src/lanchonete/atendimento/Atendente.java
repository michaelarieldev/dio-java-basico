package lanchonete.atendimento;

public class Atendente {
	
	public void servindoMesa() {
		pegarLacheCozinha();
		System.out.println("SERVINDO MESA");
	}
	private void pegarLacheCozinha() {
		System.out.println("PEGAR O LANCHE NA COZINHA");
	}
	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}
	void trocarGas() {
		System.out.println("ATENDENDE TROCANDO O GÁS");
	}
	private void pegarPedidoBalcao() {
		System.out.println("PEDANDO PEDIDO NO BALCÃO");
	}

}
