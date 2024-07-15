package ejerciciosClase3;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que lee la altura de N personas y calcula: 
 * La altura media. 
 * Cuantas personas tienen una altura superior a la media.
 * Cuantas tienen una altura inferior a la media. 
 * 
 * @author pperalta
 *
 */

public class Ejercicio01 {


	    public static void main(String[] args) {
	    	
	        int N;
	        double sumaAlturas = 0, alturaMedia;
	        int superioresMedia = 0, inferioresMedia = 0;

	        // Confirma que el valor ingresado es entero o se repite 

	        do {
	            System.out.print("Introduce el número de personas (N): ");
	            N = Consola.leerEntero();
	            if (N <= 0) {
	                System.out.println("N debe ser un entero positivo. Intenta de nuevo.");
	            }
	        } while (N <= 0);

	        double[] alturas = new double[N];

	        // Lee las alturas
	        for (int i = 0; i < N; i++) {
	            System.out.print("Introduce la altura de la persona " + (i+1) + " (en metros): ");
	            alturas[i] = Consola.leerDouble();
	            sumaAlturas += alturas[i];
	        }

	        alturaMedia = sumaAlturas / N;

	        for (double altura : alturas) {
	            if (altura > alturaMedia) {
	                superioresMedia++;
	            } else if (altura < alturaMedia) {
	                inferioresMedia++;
	            }
	        }

	        System.out.printf("Altura media: %.2f metros\n", alturaMedia);
	        System.out.println("Personas con altura superior a la media: " + superioresMedia);
	        System.out.println("Personas con altura inferior a la media: " + inferioresMedia);
	        
	    }

	}
