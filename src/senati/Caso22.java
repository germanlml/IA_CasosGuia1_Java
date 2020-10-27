package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso22 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		String nom = "";
		float n1 = 0, n2 = 0, n3 = 0;
		
		System.out.print("Nombres y Apellidos: ");
		nom = scn.nextLine();
		
		System.out.print("Nota 1 : ");
		n1 = scn.nextFloat();
		
		System.out.print("Nota 2: ");
		n2 = scn.nextFloat();
		
		System.out.print("Nota 3: ");
		n3 = scn.nextFloat();
		
		float promedio = n1 * (float)0.20 + n2 * (float)0.30 + n3 * (float)0.50;
		
		System.out.println("Resultado");
		System.out.println("=========");
		System.out.println("Promedio....: " + df.format(promedio));
		

	}

}
