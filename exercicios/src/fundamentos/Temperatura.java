package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (F° - 32) x 5/9 = C°
		
		double farenheit = 86;
		final double AJUSTE = 32;
		final double FATOR =  5 / 9.0;
		
		double resultadoC = (farenheit - AJUSTE) * FATOR;
		System.out.println(resultadoC);
		
		farenheit = 104;
		resultadoC = (farenheit - AJUSTE) * FATOR;
		System.out.println("Temperatura = " + resultadoC + "°C");
		
						
	}

}
