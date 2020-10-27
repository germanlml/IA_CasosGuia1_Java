package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso20 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		
		float venta = 0;
		
		System.out.print("Venta realizada: ");
		venta = scn.nextFloat();
		
		float incre = venta + venta * (float)0.42;
		
		System.out.println("Resultado");
		System.out.println("=========");
		System.out.println("Incremento de venta...: " + df.format(incre));

	}

}
