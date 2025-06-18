package ejercicios;

import java.util.Scanner;

public class Lista_Nombres {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidad = input.nextInt();
        
        input.nextLine();
        
        String[] estudiantes = new String[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            estudiantes[i] = input.nextLine();
        }
        
        System.out.println("\nLista de estudiantes:");
        
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
        
	}

}
