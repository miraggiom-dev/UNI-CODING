package ejercicios;

//Guardar y mostrar nombres

import java.util.ArrayList;
import java.util.Scanner;

public class Almacenar_Mostrar_Nombres {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> nombres = new ArrayList<String>();
		
		System.out.print("Ingrese la cantidad de nombres: ");
		int cantidad = Integer.parseInt(input.nextLine());
		
		for (int i = 1; i <= cantidad; i++) {
			System.out.print("Ingrese el nombre " + i + ": ");
			nombres.add(input.nextLine());
		}
		
		for (String nombre : nombres) {
			System.out.print("\n" + nombre + " ");
		}

	}

}
