package ejerciciosClase3;

import com.github.sanchezih.util.io.Consola;

public class Ejercicio02 {
	public static void main(String[] args) {

		int[] numeros = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Ingrese el número " + (i + 1) + ": ");
			numeros[i] = Consola.leerEntero();
		}

		int minimo = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] < minimo) {
				minimo = numeros[i];
			}
		}

		int maximo = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maximo) {
				maximo = numeros[i];
			}
		}

		System.out.println("El valor minimo es: " + minimo);
		System.out.println("El valor minimo se encuentra en las posiciones: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == minimo) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		System.out.println("El valor maximo es: " + maximo);
		System.out.println("El valor maximo se encuentra en las posiciones: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == maximo) {
				System.out.print(i + " ");
			}
		}

	}

}
