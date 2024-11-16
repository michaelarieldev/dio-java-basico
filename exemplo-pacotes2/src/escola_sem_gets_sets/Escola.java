package escola_sem_gets_sets;

public class Escola {

	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.nome = "Feline";
		felipe.idade = 8;
		
		System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos");
		//resultado no console
		//O aluno Felipe tem 8 anos
	}
	
}
