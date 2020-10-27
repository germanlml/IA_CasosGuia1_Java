package senati;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String app = "", nom = "";
		
		System.out.print("Ingrese Nombre: ");
		nom = scn.nextLine();
		System.out.print("Ingrese Apellido: ");
		app = scn.nextLine();
		
		System.out.println("Resultados");
		System.out.println("=========");
		System.out.println("Alumno: " + nom + " " + app);
		
		
		
		

	}

}
