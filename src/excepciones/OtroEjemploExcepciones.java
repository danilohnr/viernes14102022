package excepciones;

import java.util.NoSuchElementException;
//import java.util.InputMismatchException;
import java.util.Scanner;

public class OtroEjemploExcepciones {

	public static void main(String[] args) {
		int x = LeerEnteroSinExcepciones();
		System.out.println("x = " + x);
		int y = LeerEnteroConExcepciones();
		System.out.println("y = " + y);
	}
	//Metodo que lea un entero
	private static int LeerEntero() {
		Scanner lector = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		return lector.nextInt();
	}
	private static int LeerEnteroSinExcepciones() {
		Scanner lector = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		String entrada = lector.next();
		boolean esEntero = true;
		for (int i = 0; i < entrada.length(); i++) {
			if (!Character.isDigit(entrada.charAt(i))) {
				esEntero = false;
				break;
			}			
		}
		if (esEntero) {
			return Integer.parseInt(entrada);
		}
		return 0;
	}
	private static int LeerEnteroConExcepciones() {
		Scanner lector = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		try {
			return lector.nextInt();
		} catch (NoSuchElementException e) {
			return 0;
		}
	}
}
