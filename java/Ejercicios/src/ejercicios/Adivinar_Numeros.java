package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Adivinar_Numeros {

	public static void main(String[] args) {
		
		Random random = new Random();
		
        int numeroSecreto = random.nextInt(10) + 1;
        int intentos = 5;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Debes adivinar un número entre 1 y 10.");
        System.out.println("Tienes " + intentos + " intentos.");

        boolean adivinado = false;

        for (int i = 1; i <= intentos; i++) {
            System.out.print("Intento " + i + ". Ingresa tu número: ");
            int intentoUsuario;

            while (true) {
                if (input.hasNextInt()) {
                    intentoUsuario = input.nextInt();
                    if (intentoUsuario >= 1 && intentoUsuario <= 10) {
                        break;
                    } else {
                        System.out.print("Por favor, ingresa un número entre 1 y 10: ");
                    }
                } else {
                    System.out.print("Entrada inválida. Ingresa un número: ");
                    input.next();
                }
            }

            if (intentoUsuario == numeroSecreto) {
                System.out.println("Adivinaste el número en " + i + " intento(s).");
                adivinado = true;
                break;
            } else if (intentoUsuario < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else {
                System.out.println("El número secreto es menor.");
            }
        }

        if (!adivinado) {
            System.out.println("No lograste adivinar el número. Era: " + numeroSecreto);
        }

	}

}
