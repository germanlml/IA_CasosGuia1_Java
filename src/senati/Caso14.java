package senati;

import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = 0;
		System.out.println("Ingrese numero: ");
		n= scn.nextInt();
		
		// Por ejemplo: Si n = 5, (5 * 6) / 2 -> 15
		int sumatoria = (n * (n + 1)) / 2;
		
		System.out.println("resultados");
		System.out.println("==========");
		System.out.println("La sumatoria es...: " + sumatoria);

	}

}
