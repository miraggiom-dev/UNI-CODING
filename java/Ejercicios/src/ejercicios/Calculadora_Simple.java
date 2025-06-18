package ejercicios;

import java.util.Scanner;

public class Calculadora_Simple {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Ingrese el primer número: ");
		double x = input.nextDouble();
		
		System.out.print("Ingrese el segundo número: ");
		double y = input.nextDouble();
		
		input.nextLine();
		
		System.out.print("Ingrese el símbolo del operador: ");
		String op = input.nextLine();

		System.out.print("Resultado = ");
		
		switch (op) {
		
			case "+": System.out.println(x+y);
			break;
			
			case "-": System.out.println(x-y);
			break;
			
			case "*": System.out.println(x*y);
			break;
			
			case "/": System.out.println(x/y);
			break;
			
			default: System.out.println("ERROR !!!");
		
		}

	}

}
