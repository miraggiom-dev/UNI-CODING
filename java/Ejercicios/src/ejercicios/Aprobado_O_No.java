package ejercicios;

import java.util.Scanner;

public class Aprobado_O_No {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese la nota definitiva del alumno (0 - 20): ");
        double nota = input.nextDouble();
        
        if (nota < 0 || nota > 20) {
            System.out.println("Error: La nota ingresada no está dentro del rango válido (0 - 20).");
        } else {
            if (nota >= 9.5) {
                System.out.println("La nota " + nota + " es aprobatoria.");
            } else {
                System.out.println("La nota " + nota + " es reprobatoria.");
            }
        }

	}

}
