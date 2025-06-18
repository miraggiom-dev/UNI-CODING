package ejercicios;

import java.util.Scanner;

public class Par_O_Impar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = input.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

	}

}
