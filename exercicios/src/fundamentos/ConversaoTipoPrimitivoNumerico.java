package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		//conversão implicita (de int para double)
		double a = 1; 
		System.out.println(a);
		
		//conversão explicita (CAST nesse caso) pode haver perda de dados.
		float b = (float) 1.1234568888888;
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c; //explícita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; //explícita (CAST)
		System.out.println(f);
	}
}
