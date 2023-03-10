package fundamentos;

import java.util.Date;

public class PraticaString {

	public static void main(String[] args) {
		
		var professor = "Marta Rabelo";
		var materia = "Matemática";
		var aulas = 10;
		var salario = 12345.987;
		var horario = new Date();
				
		System.out.printf("O(a) Senhor(a): %s, professor(a) de: %s, possui %d aulas essa semana e suas horas trabalhadas serão: %.2f."
				, professor, materia, aulas, salario);
		System.out.println("\nData: " + horario);
		
	
		System.out.printf("\nOlá, Sr %s!\n", "Ross Geller"); // \n ou %n significa NEW LINE
		System.out.printf("Bom dia, Sra %s!%n", "Rachel Green");
	}
}
