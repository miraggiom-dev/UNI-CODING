package ejercicios;

// Guardar y mostrar marcas de computadora

import java.util.ArrayList;
import java.util.Scanner;

public class Almacenar_Mostrar_Marcas_PC {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> marcas = new ArrayList<String>();
		
		System.out.print("Ingrese la cantidad de marcas: ");
		int cantidad = Integer.parseInt(input.nextLine());
		
		System.out.print("\n");

		for (int i = 1; i <= cantidad; i++) {
			System.out.print("Ingrese el nombre de la marca " + i + ": ");
			marcas.add(input.nextLine());
		}
		
		System.out.println("\nLAS MARCAS INGRESADAS SON: ");
		
		for (int i = 0; i < marcas.size(); i++) {
			System.out.print("\n" + i + ". " + marcas.get(i));
		}
	}

}
