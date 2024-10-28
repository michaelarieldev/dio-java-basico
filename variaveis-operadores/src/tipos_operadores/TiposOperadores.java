package tipos_operadores;

public class TiposOperadores {

	public static void main(String[] args) {

		// operador de atribuição "="

		String nome = "Michael";

		// operadores aritméticos

		double soma = 25.8 + 16.3;
		int subtracao = 14 - 35;
		int multiplicacao = 5 * 6;
		int divisao = 14 / 7;
		int modulo = 14 % 7;
		double resultado = (20 * 3) + (32 / 4);

		// Operador de adição (+), quando utilizado em variáveis do tipo texto,
		// realizará
		// "concatenação de textos"
		// Alguns exemplos

		String nomeCompleto = "Linguagem" + "Java";

		// Qual o resultado das expressões abaixo?
		String concatenacao = "?";

		concatenacao = 1 + 1 + 1 + "1";

		concatenacao = 1 + "1" + 1 + 1;

		concatenacao = 1 + "1" + 1 + "1";

		concatenacao = "1" + 1 + 1 + 1;

		concatenacao = "1" + (1 + 1 + 1);

		// Unário

		int numero = 5;

		// Imprimindo o numero negativo
		System.out.println(-numero);

		// Incrementando numero em mais 1 número, imprime 6
		numero++;
		System.out.println(numero);

		// incrementando numero em mais 1 número, imprime 7
		System.out.println(numero++);// ops algo de errado não está certo

		System.out.println(numero);// agora sim, numero virou 7

		// ordem de precedencia conta aqui
		System.out.println(++numero);

		boolean verdadeiro = true;

		// Inverter o valor de uma variavel boleana com "!"

		System.out.println("Inverteu " + !verdadeiro);

		// Operador ternário
		String resultadoIf;

		int a, b;

		a = 5;
		b = 6;

		// Exemplo de condicional utilizando uma estrutura IF / ELSE

		if (a == b) {
			resultadoIf = "verdadeiro";
		} else {
			resultadoIf = "falso";
		}

		// Mesma condicinal, mas dessa vez, utilizando o operador ternário "?"
		String resultadoTernario = (a == b) ? "verdadeiro" : "falso";

		// O operador ternário é aplicado para qualquer tipo de valor
		System.out.println(resultadoTernario);

		// Operadores relacionais

		// == Quando desejamos verificar se uma variável é IGUAL A outra.

		// != Quando desejamos verificar se uma variável é DIFERENTE da outra.

		// > Quando desejamos verificar se uma variável é MAIOR QUE a outra.

		// >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

		// < Quando desejamos verificar se uma variável é MENOR QUE outra.

		// <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

		int numero1 = 1;
		int numero2 = 2;

		boolean simNao = numero1 == numero2;
		System.out.println("NúmeroUm é igual a númeroDois? " + simNao);

		String nomeUm = "Michael";
		String nomeDois = "Michael";

		System.out.println("NomeUm e NomeDois são iguais? " + (nomeUm == nomeDois));

		String nomeTres = new String("Michael");

		// Imprimindo quando criamos uma Objeto com o mesmo nome
		System.out.println("NomeUm e nomeTres(Objeto) são iguais? " + (nomeUm == nomeTres));

		// Compara os dois Objetos tem o mesmo conteúdo, utilizamos o ".equals"
		System.out.println("NomeUm e nomeTres(Objeto) são iguais? " + nomeUm.equals(nomeTres));

		// Operadores Lógicos

		// && Operador Lógico "E"
		// || Operador Lógico "OU"

		boolean condicao1 = true;
		boolean condicao2 = false;

		if (condicao1 && condicao2)
			System.out.println("Os dois valores precisam ser verdadeiros");
		// Não será impresso pois um deles é falso no caso "condicao2" mas se nós
		// utilizarmos o "!" -> "!condicao2"
		// vai se tornar verdadeiro pois vamos inverter de "falso" para "true"

		if (condicao1 && !condicao2 && (7 > 4))
			System.out.println("Os três valores precisam ser verdadeiros");

		if (condicao1 || condicao2)
			System.out.println("Um dos valores precisam ser verdadeiros");

	}

}
