package sistema_smart_tv;

public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void ligar() {
		ligada = true;
	}
	public void desligar() {
		ligada = false;
	}
	public void aumentarVolume() {
		volume++;
		System.out.println("Volume aumentado para: " + volume);
	}
	public void diminuirVolume() {
		volume--;
		System.out.println("Diminuindo volume para: " + volume);
	}
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
		System.out.println("Alterando canal para: " + canal);
	}
	public void aumentarCanal() {
		canal++;
		System.out.println("Aumentando canal para: " + canal);
	}
	public void diminuirCanal() {
		canal--;
		System.out.println("Diminuindo canal para: " + canal);
	}
}
