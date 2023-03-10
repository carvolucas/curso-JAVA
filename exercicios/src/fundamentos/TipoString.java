package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(2));
		
		String s = "Boa tarde";
				
		System.out.println(s.concat("!!!"));
		System.out.println(s + ("!!"));
		
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.equalsIgnoreCase("Boa Tarde"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println(s.length());
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		//para n precisar ficar assim (muito concatenado)...
		System.out.println("Nome: "  + nome + "\nSobrenome: " 
		  + sobrenome + "\nIdade: " + idade + " anos" 
		  + "\nSalário: " + salario + "\n \n");
		
		//usa-se assim:
		
		System.out.printf("O Senhor: %s %s tem %d anos e ganha R$%.2f."
				, nome, sobrenome, idade, salario);
		//ou
		String frase = String.format("O Senhor: %s %s tem %d anos e ganha R$%.2f."
				, nome, sobrenome, idade, salario);
		System.out.println("\n \n" + frase);
		
		
		}
}
