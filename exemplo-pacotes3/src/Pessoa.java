public class Pessoa {

	private String nome;
	private String cpf;
	private String endeco;
	
	public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndeco() {
		return endeco;
	}
	public void setEndeco(String endeco) {
		this.endeco = endeco;
	}
	//...
	//setters de nome e cpf?
	
}
