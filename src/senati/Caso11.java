package senati;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String nombre = ""; // Crea un objeto
		
		System.out.print("Ingrese un texto: ");
		nombre = scn.nextLine();
		
		System.out.println("Número Ingresado");
		System.out.println("================");
		System.out.println("Número de caracteres....: " + nombre.length());

	}

}
