public class SistemaCadastro {

	public static void main(String[] args) {
		
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("123-254-697-89", "Marcos");
		
		//definimos o endereço de marcos
		marcos.setEndeco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do morcos?
		
		//imprimindo o marcos sem nome e cpf

		
		System.out.println(marcos.getNome() + " - " + marcos.getCpf());
	}
	
}
