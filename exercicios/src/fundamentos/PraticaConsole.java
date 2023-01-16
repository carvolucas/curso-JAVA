package fundamentos;

import java.util.Scanner;

public class PraticaConsole {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
	String nome = entrada.nextLine();	
		
 	    System.out.print("Digite seu sobrenome: ");
	String sobrenome = entrada.nextLine();	
		
	    System.out.print("Digite sua idade: ");
	int idade = entrada.nextInt();
	entrada.nextLine(); //precisa por para ignorar o /n que ficará no buffer após apertar o ENTER
	
	    System.out.print("Digite seu curso: ");
	String curso = entrada.nextLine();
	
	    System.out.print("Digite o ano de conclusão do curso: ");
	int ano = entrada.nextInt();
	
	System.out.printf("%n%s %s tem %d anos, cursa %s e concluirá seus estudos em %d. %n",
			nome, sobrenome, idade, curso, ano);
	
	entrada.close();

	
	}
}
