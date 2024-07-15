package ejerciciosClase3;

import com.github.sanchezih.util.io.Consola;

public class Ejercicio03 {

    public static void main(String[] args) {  
    	
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número " + (i+1) + ": ");
            numeros[i] = Consola.leerEntero();
        }

        boolean esCapicua = true;
        for (int i = 0; i < numeros.length / 2; i++) {
            if (numeros[i] != numeros[numeros.length - 1 - i]) {
                esCapicua = false;
                break;
            }
        }

        if (esCapicua) {
            System.out.println("El arreglo es capicua");
        } else {
            System.out.println("El arreglo no es capicua.");
        }
        
    }

}
 
