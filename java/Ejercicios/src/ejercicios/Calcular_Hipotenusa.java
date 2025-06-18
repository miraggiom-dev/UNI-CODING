package ejercicios;

public class Calcular_Hipotenusa {

	public static void main(String[] args) {
		
		double cateto1 = Math.ceil(Math.sin(45)) + Math.sqrt(9);
        double cateto2 = -Math.abs(Math.pow(21, (-10 + 10))) + Math.pow(256, 1.0 / 4.0);

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("Cateto 1: " + cateto1);
        System.out.println("Cateto 2: " + cateto2);
        System.out.println("Hipotenusa: " + hipotenusa);

	}

}
