package lanchonete.atendimento.cozinha;

public class Cozinheiro {
	//pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NO BALCÃO");
	}
	//pode ser default
	public void adcionarSucoNoBalcao() {
		System.out.println("ADICIONANO SUCO NO BALÃO");
	}
	//pode ser default
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adcionarSucoNoBalcao();
	}
	
	private void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGUE");
	}
	
	private void prepararVitamina() {
		System.out.println("PREPARANDO SUCO");
	}
	
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
	}
	
	private void selecionarIngredientesVitanica() {
		System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
	}
	
	private void lavarIngredientes() {
		System.out.println("LAVAR INGREDIENTES");
	}
	
	private void baterVitaminaLiquificador() {
		System.out.println("BATENDO VINTANINA NO LIQUIFICADOR");
	}
	
	public void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGUE");
	}
	
	//não pode mais pedir pois somento a nivel de pacote "atendente" pode solicitar
//	public void pedirParaTrocarGas(Atendente meuAmigo) {
//		meuAmigo.trocarGas();
//	}
	
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
