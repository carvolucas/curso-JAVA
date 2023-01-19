package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicosOutro {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String resposta;
		
		System.out.println("Vai trabalhar na terça-feira? ");
		String trabalhoTerca = entrada.nextLine();
		
		System.out.println("Vai trabalhar na quinta-feira? ");
		String trabalhoQuinta = entrada.nextLine();
		
	
	  if (trabalhoTerca.equals("sim") && trabalhoQuinta.equals("sim")){
	resposta = "Você vai ao shopping com sua família, comprará uma TV de 50\" pra você e um sorvete para todo mundo!";
	
	} else if (trabalhoTerca.equals("sim") || trabalhoQuinta.equals("sim")){
	resposta = "Você vai ao shopping com sua família, comprará uma TV de 32\" pra você e um sorvete para todo mundo!";
	
	} else {
		resposta = "Você e sua família ficarão em casa para não gastar dinheiro e não comer besteira :) ";
	}
	
	  System.out.println(resposta);
	  
	  entrada.close();
		
		
		
		
	}
}
