package ejercicios;

import java.util.Scanner;

public class Tabla_Multiplicar {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un número para mostrar su tabla de multiplicar: ");
        int numero = input.nextInt();
        
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

	}

}
