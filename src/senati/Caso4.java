package senati;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		float num1 = 0, num2= 0;
		
		System.out.print("Inngrese primer numero: ");
		num1 = scn.nextFloat();
		
		System.out.print("Ingrese segundo numero: ");
		num2 = scn.nextFloat();
		
		float suma = num1 + num2;
		float resta = num1 - num2;
		float producto = num1 * num2;
		float division = num1 / num2;
		// CAST -> Forzar la conversion a un tipo de dato.
		int residuo = (int) (num1 % num2);
		
		System.out.println("Numero Ingresado");
		System.out.println("================");
		System.out.println("Suma.............: " + suma);
		System.out.println("Resta............: " + resta);
		System.out.println("Multiplicación...: " + producto);
		System.out.println("División.........: " + division);
		System.out.println("Resto entero.....: " + residuo);
		

	}

}
