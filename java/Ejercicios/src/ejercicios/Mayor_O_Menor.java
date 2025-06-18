package ejercicios;

import java.util.Scanner;

public class Mayor_O_Menor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        
        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
            System.out.println("El número menor es: " + num2);
        } else if (num1 < num2) {
            System.out.println("El número mayor es: " + num2);
            System.out.println("El número menor es: " + num1);
        } else {
            System.out.println("Ambos números son iguales: " + num1);
        }

	}

}
