package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia x";
		s = s.replace("x", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase()
				        .concat(", atenção");
		System.out.println(x);
		/* System.out.println("Leo".toUpperCase());
		 *   o comando tbm pode ser representado assim, sem a variável
		 */
		
		
		// Não é posivel misturar string com int
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos (int, double, etc) não tem operador "."
		
		String z = "\nX é uma pessoa legal"				
				.repeat(3)
				.replace("X", "Lucas");
				
		        System.out.println(z + "\n");
				System.out.println(z.length());
				System.out.println(z.startsWith("\nLucas"));
							
	}
}
