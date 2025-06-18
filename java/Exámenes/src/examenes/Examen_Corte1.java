package examenes;

import java.util.Scanner;

public class Examen_Corte1 {

	public static void main(String[] args) {
		
		// Ejercicio 1
		
		double base1 = Math.pow(50, 2);
		double raiz = Math.sqrt(5 * 1000);
		double seno = Math.sin(30 + 60.0 / 4);
		double denominador = Math.round(Math.pow(Math.cos((60)), 2) + Math.tan((30)));
		
		double resultado = Math.log(base1 + raiz - (seno / denominador));
		System.out.println("El valor de N es: " + resultado);
		
		// Ejercicio 2
        
        Scanner input = new Scanner (System.in);
		
		System.out.print("Ingrese el usuario: ");
		String user = input.nextLine();
		
		System.out.print("Ingrese la contraseña: ");
		String password = input.nextLine();
		
		System.out.println("Bienvenido, " + user + ".");

		double nota1, nota2, nota3;

        do {
            System.out.print("\nIngrese la nota del primer corte (0-20): ");
            nota1 = input.nextDouble();
            
            if (nota1 < 0 || nota1 > 20) {
                System.out.println("ERROR !!! La nota debe estar entre 0 y 20.");
            }
        } while (nota1 < 0 || nota1 > 20);

        do {
            System.out.print("Ingrese la nota del segundo corte (0-20): ");
            nota2 = input.nextDouble();
            
            if (nota2 < 0 || nota2 > 20) {
                System.out.println("ERROR !!! La nota debe estar entre 0 y 20.");
            }
        } while (nota2 < 0 || nota2 > 20);

        do {
            System.out.print("Ingrese la nota del tercer corte (0-20): ");
            nota3 = input.nextDouble();
            if (nota3 < 0 || nota3 > 20) {
                System.out.println("ERROR !!! La nota debe estar entre 0 y 20.");
            }
        } while (nota3 < 0 || nota3 > 20);

        double nota_final = (nota1 * 0.3) + (nota2 * 0.3) + (nota3 * 0.4);
        double nota_promedio = (nota1 + nota2 + nota3) / 3;
        double nota_maxima = Math.max(nota1, Math.max(nota2, nota3));
        double nota_minima = Math.min(nota1, Math.min(nota2, nota3));

        System.out.println("\nRESULTADOS DEL ALUMNO " + user + ".");
        System.out.println("\nNota final: " + nota_final);
        System.out.println("Nota promedio: " + nota_promedio);
        System.out.println("Nota más alta: " + nota_maxima);
        System.out.println("Nota más baja: " + nota_minima);
        
        // Ejercicio 3
		
		System.out.print("\nIngrese un número: ");
        int numero = input.nextInt();
        
        System.out.println("\nTABLA DE MULTIPLICAR DEL " + numero + ".");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

	}

}
