package sistema_smart_tv;

public class Usuario {
	
	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV ligada? " + smartTv.ligada);
		System.out.println("Canal atual : " + smartTv.canal);
		System.out.println("Volume atual : " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		
		smartTv.aumentarCanal();
		
		smartTv.diminuirVolume();
		
		smartTv.mudarCanal(14);
		
		smartTv.desligar();
		System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
		
	}

}
