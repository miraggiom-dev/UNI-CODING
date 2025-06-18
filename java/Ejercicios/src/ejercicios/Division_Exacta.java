package ejercicios;

import java.util.Scanner;

public class Division_Exacta {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    
	    System.out.print("Ingrese el numerador: ");
	    int numerador = input.nextInt();
	    
	    System.out.print("Ingrese el denominador: ");
	    int denominador = input.nextInt();
	    
	    if (numerador % denominador == 0){
	        System.out.println("La división es exacta (múltiplos).");
	    }
	    else{
	        System.out.println("La división no es exacta.");
	    }

	}

}
