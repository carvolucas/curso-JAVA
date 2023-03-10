package fundamentos;

public class Wrapper {

	public static void main(String[] args) {
		
		/* Usando o wrapper, podemos usar a notação ponto e atribuir características aos
		 * "tipos primitivos"
		 */
		Byte b = 100;
		Short s = 1000;
		
		//Integer.parseInt(entrada.next());
		Integer i = 10000; //tipo primitivo = int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString()); //o valor foi convertido para uma string
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c + "...");
		
	}
}
