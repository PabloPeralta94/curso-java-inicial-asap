package ejerciciosClase4;

import java.util.Arrays;

public class Ejercicio02 {
	public static void main(String[] args) {

		int[] arrayBailarines = new int[8];

		for (int i = 0; i < arrayBailarines.length; i++) {
			arrayBailarines[i] = (int) (Math.random() * 10) + 1;
		}

		System.out.println("Bailarines desordenados: " + Arrays.toString(arrayBailarines));
		ordenarBurbuja(arrayBailarines);
		System.out.println("Bailarines ordenados: " + Arrays.toString(arrayBailarines));

	}

	public static void ordenarBurbuja(int[] arrayBailarines) {

		int n = arrayBailarines.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arrayBailarines[j] > arrayBailarines[j + 1]) {
					int bailarinIzquierda = arrayBailarines[j];
					arrayBailarines[j] = arrayBailarines[j + 1];
					arrayBailarines[j + 1] = bailarinIzquierda;
				}
			}
		}
	}
}
