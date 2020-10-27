package senati;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float num1 = 0, num2= 0;
		
		System.out.print("Inngrese primer numero: ");
		num1 = scn.nextFloat();
		
		System.out.print("Ingrese segundo numero: ");
		num2 = scn.nextFloat();
		
		System.out.println("Numero Ingresado");
		System.out.println("================");
		System.out.println("Número 1: " + num1);
		System.out.println("Número 2: " + num2);
		
	}

}
