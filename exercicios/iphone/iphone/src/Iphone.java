import recursos.AparelhoTelefonico;
import recursos.NavegadorInternet;
import recursos.ReprodutorMusica;

public class Iphone {
	
	public static void main(String[] args) {
		
		NavegadorInternet AppNavegador = new NavegadorInternet();
		
		System.out.println("\nIniciando App de Navegador");
		AppNavegador.adicionarAba();
		AppNavegador.exibirPagina("https://github.com/michaelarieldev");
		AppNavegador.atualizarPagina();
		
		ReprodutorMusica AppMusica = new ReprodutorMusica();
		
		System.out.println("\nIniciando App de Música");
		AppMusica.selecionarMusica("Billie Jean");
		AppMusica.tocar();
		AppMusica.pausar();
		
		AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
		
		System.out.println("\nIniciando App de Telefone");
		aparelhoTelefonico.iniciarCorreioVoz();
		aparelhoTelefonico.ligar("40028922");
		aparelhoTelefonico.atender();
		
	}

}
