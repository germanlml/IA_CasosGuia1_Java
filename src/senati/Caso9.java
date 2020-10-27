package senati;

import java.util.Scanner;

public class Caso9 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		
		System.out.print("Ingrese el base del rectangulo: ");
		num1 = scn.nextInt();
		System.out.print("Ingrese el altura del rectangulo: ");
		num2 = scn.nextInt();
		
		int perimetro = 2 * num1 + 2 * num2;
		int area = num1 * num2;
		
		System.out.println("Resultados");
		System.out.println("==========");
		System.out.println("Perimetro del rectangulo...: " + perimetro);
		System.out.println("Area del rectangulo........: " + area);
		
	}

}
