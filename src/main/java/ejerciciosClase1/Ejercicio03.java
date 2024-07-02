package ejerciciosClase1;

import ar.edu.ort.p1.util.Consola;

/**
 * El programa lee por teclado una calificacion numerica entre 0 y 10 y muestra
 * por pantalla su correspondiente calificacion alfabetica.
 * 
 * La equivalencia entre la calificacion numerica y la alfabetica se muestra en
 * esta tabla:
 * 
 * 0 <= nota < 5 Insuficiente 5 <= nota < 6 Suficiente 6 <= nota < 7 Bien 7 <=
 * nota < 9 Notable 9 <= nota <= 10 Sobresaliente
 * 
 * La calificacion numerica que se introduce por teclado debe estar comprendida
 * entre 0 y 10 para poder obtener su equivalente calificacion alfabetica. Si la
 * calificacion introducida no es valida se muestra un mensaje indicandolo y el
 * programa finaliza.
 * 
 * 
 * 
 * 
 * @author pperalta
 *
 */

public class Ejercicio03 {
	public static void main(String[] args) {

		int calificación = Consola.leerEntero("Introduce tu calificación númerica");

		if (calificación <= 5) {
			System.out.println("Insuficiente");
		} else if (calificación <= 6) {
			System.out.println("Suficiente");
		} else if (calificación <= 7) {
			System.out.println("Bien");
		} else if (calificación <= 9) {
			System.out.println("Notable");
		} else {
			System.out.println("Sobresaliente");
		}

	}

}
