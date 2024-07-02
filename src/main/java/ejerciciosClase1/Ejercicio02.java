package ejerciciosClase1;

import ar.edu.ort.p1.util.Consola;

/**
 *Crear un programa que pide por teclado la fecha de nacimiento de una persona (día, mes, año) y calcula su numero de la suerte.
El numero de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es 12/07/1980
Calculamos el numero de la suerte así: 12+7+1980 = 1999 1+9+9+9 = 28
Numero de la suerte: 28

 * 
 * 
 * @author pperalta
 *
 */
public class Ejercicio02 {
	public static void main(String[] args) {
	
	int dia = Consola.leerEntero("Ingresa el número del día en que naciste");
	int mes = Consola.leerEntero("Ingresa el número del mes en que naciste");
	int año = Consola.leerEntero("Ingresa el número del año en que naciste");
	
	int total = dia + mes + año;
	int numeroSuerte = (total/1000)+ ((total/10) % 10) + ((total/10) % 10) + (total % 10);
	
	System.out.println(total);
	System.out.println(numeroSuerte);
	
	}
}
