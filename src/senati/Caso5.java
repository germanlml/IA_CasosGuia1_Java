package senati;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float num1 = 0, num2 = 0;
		System.out.print("Ingrese primer número: ");
		num1 = scn.nextFloat();
		
		System.out.print("Ingrese segundo número: ");
		num2 = scn.nextFloat();
		
		
		float promedio = (num1 + num2) / 2;
		float aum = num1 + (float) (num1 * 0.2);
		float dis = num2 - (float) (num2 * 0.3);
		
		System.out.println("Resultados");
		System.out.println("================");
		System.out.println("Promedio..............: " + promedio);
		System.out.println("Numero 1 aumentado....: " + aum);
		System.out.println("Número 2 disminuido...: " + dis);
		
		
		

	}

}
