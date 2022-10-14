package excepciones;

public class IntroExcepciones {

	public static void main(String[] args) {
		//Dividir 2 numeros
		int x = 48, y = 0;
		System.out.println(DividirSinExcepciones(x,y));
		System.out.println(DividirConExcepciones(x,y));
		System.out.println(Dividir(x,y));
	}
	
	private static int DividirSinExcepciones(int x, int y) {
		if( y != 0) {
			return x/y;
		} else {
			return 0;
		}		
	}
	private static int DividirConExcepciones(int x, int y) {
		try {
			return x/y;
		} catch(ArithmeticException ex) {
			return 0;
		}
	}
	private static int Dividir(int x, int y) {
		return x / y;
	}
}
