package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * a;
		c /= a; // c = c / a;
		c %= 2; // c = c % 2; vai dar 0 ou 1 (par ou ímpar)
		
		System.out.println(c);
	}
}
