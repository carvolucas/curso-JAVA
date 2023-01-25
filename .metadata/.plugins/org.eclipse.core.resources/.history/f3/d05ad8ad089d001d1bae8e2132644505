package fundamentos;

import java.util.Scanner;

public class DesafioCalculadoraOutro {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite o sinal da operação ( + , - , * , / ): ");
		String sinal = entrada.next();
		
		//Lógica
		double resultado = "+".equals(sinal) ? num1 + num2 : 0;
		resultado = "-".equals(sinal) ? num1 - num2 : resultado;
		resultado = "*".equals(sinal) ? num1 * num2 : resultado;
		resultado = "/".equals(sinal) ? num1 / num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",
				num1, sinal, num2, resultado);
		
		entrada.close();
	}
}
