package senati;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a = 0, b = 0, c = 0;
		
		System.out.print("Lado 1: ");
		a = scn.nextInt();
		
		System.out.print("Lado 2: ");
		b = scn.nextInt();
		
		System.out.print("Lado 3: ");
		c = scn.nextInt();
		int perimetro = a + b + c;
		
		if (a <  b+ c && b < c + a && b < a + c) {
		
			System.out.println("Resultado");
			System.out.println("=========");
			System.out.println("Perimetro del triangulo....: " + perimetro);
		}
		else
			System.out.println("El triangulo no existe");
	}

}
