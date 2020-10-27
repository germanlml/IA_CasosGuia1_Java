package senati;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int radio = 0;
		
		System.out.print("Ingrese radio: ");
		radio = scn.nextInt();
		
		
		float perimetro = 2 * (float) 3.14 * radio;
		float area = (float)(3.14) * (int)Math.pow(radio, 2);
		
		System.out.println("Resultados");
		System.out.println("==========");
		System.out.println("Perimetro del circulo...: " + perimetro);
		System.out.println("Area del circulo........: " + area);
		

	}

}
