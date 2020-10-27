package senati;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		// Instancia a la clase Scanner
		// Crear un objeto a partir de una clase
		Scanner scn = new Scanner(System.in);
		
		int numero = 0;
		System.out.print("Ingrese un numero: ");
		numero = scn.nextInt();
		
		System.out.println("Numero Ingresado");
		System.out.println("================");
		System.out.println("Número: " + numero);
	}
}
