package excepciones;

import java.util.Scanner;

public class OtroEjemploExcepciones {

	public static void main(String[] args) {
		int x = LeerEntero();
	}
	//Metodo que lea un entero
	private static int LeerEntero() {
		Scanner lector = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		return lector.nextInt();
	}
}
