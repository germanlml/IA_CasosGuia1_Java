package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso24 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		float m1 = 0, m2 = 0, m3 = 0;
		
		System.out.println("Ingrese primer monto: ");
		m1 = scn.nextFloat();
		System.out.println("Ingrese segundo monto: ");
		m2 = scn.nextFloat();
		System.out.println("Ingrese tercer monto: ");
		m3 = scn.nextFloat();
		
		float suma = m1 + m2 + m3;
		float cal1 = m1 / 5 + m2 * (float)0.20;
		float cal2 = (m3 + m3 * (float)0.60) / 2;
		float cal3 = suma - suma * (float)0.08;
		
		System.out.println("R E S U L T A D O S");
		System.out.println("===================");
		System.out.println("Primer cálculo.....: " + df.format(cal1));
		System.out.println("Segundo cálculo....: " + df.format(cal2));
		System.out.println("Tercer cálculo.....: " + df.format(cal3));

	}

}
