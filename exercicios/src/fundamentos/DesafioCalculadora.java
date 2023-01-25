package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		double num1 = entrada.nextDouble();
		entrada.nextLine();

		System.out.println("Digite o sinal da operação ( + , - , * , / ): ");
		String sinal = entrada.next();

		System.out.println("Digite o segundo numero: ");
		double num2 = entrada.nextDouble();

		String resultado = "";

		boolean soma = sinal.equals("+");
		resultado = soma ? Double.toString(num1 + num2) : resultado;

		boolean menos = sinal.equals("-");
		resultado = menos ? Double.toString(num1 - num2) : resultado;

		boolean vezes = sinal.equals("*");
		resultado = vezes ? Double.toString(num1 * num2) : resultado;

		boolean divisao = sinal.equals("/");
		resultado = divisao ? Double.toString(num1 / num2) : resultado;

		System.out.printf("%s %s %s = %s",
				num1, sinal, num2, resultado);

		entrada.close();
	}
}
