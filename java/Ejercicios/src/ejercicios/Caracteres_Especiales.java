package ejercicios;

import java.util.Scanner;

public class Caracteres_Especiales {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    
	    System.out.println("Introduzca un texto: ");
	    String texto = input.nextLine();
	    
	    String especiales = "!@#$%&*=+?><~.,;:";
	    boolean tieneEspeciales = false;
	    
	    for (int i = 0; i < especiales.length(); i++) {
	        if (texto.indexOf(especiales.charAt(i)) != -1) {
	            tieneEspeciales = true;
	        }
	    }
	    
	    if (tieneEspeciales) {
	        System.out.print("Su texto contiene carácteres especiales.");
	    } else {
	        System.out.print("Su texto no contiene carácteres especiales.");
	    }


	}

}
