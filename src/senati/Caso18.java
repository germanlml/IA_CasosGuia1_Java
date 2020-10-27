package senati;

import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float base = 0, altura = 0;
		
		System.out.print("Ingrese Base: ");
		base = scn.nextFloat();
		System.out.print("Ingrese Altura: ");
		altura = scn.nextFloat();
		
		float area = (base * altura) / 2;
		
		System.out.println("Resultado");
		System.out.println("=========");
		System.out.println("Area del triangulo....: " + area);
		

	}

}
