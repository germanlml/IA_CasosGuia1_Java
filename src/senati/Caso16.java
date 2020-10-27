package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso16 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		int horas = 0;
		float tarifa = 0;
		
		System.out.println("Ingrese horas trabajadas: ");
		horas = scn.nextInt();
		
		System.out.println("Ingrese tarifa por horas: ");
		tarifa = scn.nextFloat();
		
		float sueldo = horas * tarifa;
		float bono = sueldo * (float)0.05;
		float total = sueldo + bono;
		float dolar = total / (float)3.24;
		
		System.out.println("Resultados");
		System.out.println("=========");
		System.out.println("Sueldo............: " + df.format(sueldo));
		System.out.println("Bono..............: " + df.format(bono));
		System.out.println("Total.............: " + df.format(total));
		System.out.println("Total en dólares..: " + df.format(dolar));
		

	}

}
