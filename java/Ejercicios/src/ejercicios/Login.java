package ejercicios;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String userS = "admin", passwordS = "5455";
		
		System.out.print("Ingrese el usuario: ");
		String user = input.nextLine();
		
		System.out.print("Ingrese la contraseña: ");
		String password = input.nextLine();
		
		if (user.equals(userS) && password.equals(passwordS)) {
			System.out.print("Bienvenido, admin.");
		} else {
			System.out.print("Acceso denegado.");
		}

	}

}
