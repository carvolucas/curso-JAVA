package fundamentos;

import java.util.Locale;

public class TestLocale {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault(Locale.Category.DISPLAY));
		System.out.println(Locale.getDefault(Locale.Category.FORMAT));
	
	}
}
