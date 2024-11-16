//Criando o enum EstadoBrasileiro para ser usado em toda aplicação
public enum EstadoBrasileiro {

	SA0_PAULO ("SP", "São Paulo",11),
	RIO_JANEIRO ("RJ", "Rionde Janeiro",12),
	PIAUI ("PI", "Piauí",13),
	MARANHAO ("MA", "Maranhão",14),
	CEARA ("CE", "Ceará",15);
	
	private String nome;
	private String sigla;
	private int Ibge;
	
	private EstadoBrasileiro(String sigla, String nome, int Ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.Ibge = Ibge;
	}
	
	public int getIbge() {
		return Ibge;
	}
	
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
}
