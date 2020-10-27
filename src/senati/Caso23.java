package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso23 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		String nom = "";
		float precio = 0;
		int cantidad = 0;
		
		System.out.print("Producto: ");
		nom = scn.nextLine();
		
		System.out.print("Precio: ");
		precio = scn.nextFloat();
		
		System.out.print("Cantidad");
		cantidad = scn.nextInt();
		
		float importe = precio * cantidad;
		float igv = importe * (float)0.18;
		float desct = importe *(float) 0.03;
		float total = importe - (desct+ igv);
		
		System.out.println("Resultados");
		System.out.println("==========");
		System.out.println("Importe......: " + df.format(importe));
		System.out.println("IGV..........: " + df.format(igv));
		System.out.println("Descuento....: " + df.format(desct));
		System.out.println("Total........: " + df.format(total));
		
		

	}

}
