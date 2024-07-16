package ejerciciosClase4;

import com.github.sanchezih.util.io.Consola;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		int numero = Consola.leerEntero("inserte numero");
		System.out.println(esPrimo(numero));
		
}
	
	public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true; 
    }
}


