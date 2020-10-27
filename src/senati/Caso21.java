package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso21 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		
		float gasto = 0;
		
		System.out.print("Ingrese gasto: ");
		gasto = scn.nextFloat();
		
		float dism = gasto - gasto * (float)0.12;
		
		System.out.println("Resultado");
		System.out.println("=========");
		System.out.println("Incremento de venta...: " + df.format(dism));

	}

}
